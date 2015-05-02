package businessLogic;



public class HeapSortByDouble {
	private static int heapSize; 
	/*public static void main(String[] args) {  
        Random rand = new Random();  
        double[][] a = new double[15][2];  
        for (int i = 0; i < a.length; i++) 
        {
        	 a[i][0] = rand.nextDouble();
        	 a[i][1] = i;
        }
        
        heapSort(a);  
        for (int i =0;i<15;i++)  
            System.out.print((int)a[i][1] + " ");
        for (int i =0;i<15;i++)  
            System.out.print(a[i][0] + " ");
    } */
	public static void heapSort(double[][] a) {  
        heapSize = a.length;  
        buildMinHeap(a);  
        for (int i = a.length - 1; i >= 1; i--) {  
            swap(a, i, 0);  
            heapSize = heapSize - 1;  
            minHeapify(a, 0);  
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
  
    private static void minHeapify(double[][] a, int i) {  
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
