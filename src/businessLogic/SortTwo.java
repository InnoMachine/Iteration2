package businessLogic;

public class SortTwo {
	private static int heapSize; 

	public static void heapSort(double[][] a,boolean issame) {
		if(issame){
			heapSize = a.length;  
	        buildMinHeap(a);  
	        for (int i = a.length - 1; i >= 1; i--) {  
	            swap(a, i, 0);  
	            heapSize = heapSize - 1;  
	            minHeapify(a, 0);  
	            }  
		}
		else{
			heapSize = a.length;  
	        buildMinHeap2(a);  
	        for (int i = a.length - 1; i >= 1; i--) {  
	            swap(a, i, 0);  
	            heapSize = heapSize - 1;  
	            minHeapify2(a, 0);  
	            }  
		}
        }  
  
    private static void swap(double[][] a, int i, int j) {  
        double temp[] = a[i];  
        a[i] = a[j];  
        a[j] = temp;  
        }  
  
    private static void buildMinHeap(double[][] a) {  
        for (int i = a.length / 2; i >= 0; i--) {  
            minHeapify(a, i);  
        }  
   }  
    private static void buildMinHeap2(double[][] a) {  
        for (int i = a.length / 2; i >= 0; i--) {  
            minHeapify(a, i);  
        }  
   }  
  
    private static void minHeapify(double[][] a, int i) {  
        int l = left(i);  
        int r = right(i);  
        int largest = i;  
        if (l < heapSize && a[l][0] < a[i][0])  
            largest = l;  
        else  if(l < heapSize && a[l][0] == a[i][0]&&a[l][2]<a[largest][2])
           largest = l; 
        else 
        	largest = i;
        if (r < heapSize && a[r][0] < a[largest][0])  
            largest = r;
        else if(r < heapSize && a[r][0] == a[largest][0]&&a[r][2]<a[largest][2])
        	largest = r;
        if (largest != i) {  
            swap(a, i, largest);  
            minHeapify(a, largest);  
        }  
    }  
    private static void minHeapify2(double[][] a, int i) {  
        int l = left(i);  
        int r = right(i);  
        int largest = i;  
        if (l < heapSize && a[l][0] < a[i][0])  
            largest = l;  
        else  if(l < heapSize && a[l][0] == a[i][0]&&a[l][2]>a[largest][2])
           largest = l; 
        else 
        	largest = i;
        if (r < heapSize && a[r][0] < a[largest][0])  
            largest = r;
        else if(r < heapSize && a[r][0] == a[largest][0]&&a[r][2]>a[largest][2])
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
