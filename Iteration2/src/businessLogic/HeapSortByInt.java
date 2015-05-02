package businessLogic;

public class HeapSortByInt {
	private static int heapSize;

	public static void heapSort(int[][] a) {
		heapSize = a.length;
		buildMinHeap(a);
		for (int i = a.length - 1; i >= 1; i--) {
			swap(a, i, 0);
			heapSize = heapSize - 1;
			minHeapify(a, 0);
		}
	}

	private static void swap(int[][] a, int i, int j) {
		int temp[] = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static void buildMinHeap(int[][] a) {
		for (int i = a.length / 2; i >= 0; i--) {
			minHeapify(a, i);
		}
	}

	private static void minHeapify(int[][] a, int i) {
		int l = left(i);
		int r = right(i);
		int largest = i;
		if (l < heapSize && a[l][0] < a[i][0])
			largest = l;
		else
			largest = i;
		if (r < heapSize && a[r][0] < a[largest][0])
			largest = r;
		if (largest != i) {
			swap(a, i, largest);
			minHeapify(a, largest);
		}
	}

	private static int left(int i) {
		return 2 * i;
	}

	private static int right(int i) {
		return 2 * i + 1;
	}
}
