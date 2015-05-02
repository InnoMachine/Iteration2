package businessLogic;

public class HeapSortByString {
	private static int heapSize;  
	  
    /*public static void main(String[] args) {  
        Random rand = new Random();  
        String[] a = {"abc","acb","bbd","lds","ds","pea","aff"};  
        heapSort(a);  
        for (String i : a)  
            System.out.print(i + " ");  
    } */ 
  
    public static void heapSort(String[][] a) {  
        heapSize = a.length;  
        buildMaxHeap(a);  
        for (int i = a.length - 1; i >= 1; i--) {  
            swap(a, i, 0);  
            heapSize = heapSize - 1;  
            maxHeapify(a, 0);  
            }  
        }  
  
    private static void swap(String[][] a, int i, int j) {  
    	String[] temp = a[i];  
        a[i] = a[j];  
        a[j] = temp;  
        }  
  
    private static void buildMaxHeap(String[][] a) {  
        for (int i = a.length / 2; i >= 0; i--) {  
            maxHeapify(a, i);  
        }  
   }  
  
    private static void maxHeapify(String[][] a, int i) {  
        int l = left(i);  
        int r = right(i);  
        int largest = i;  
        if (l < heapSize && a[l][0].compareTo(a[i][0])>0)  
            largest = l;  
        else  
           largest = i;  
        if (r < heapSize && a[r][0].compareTo(a[largest][0])>0 )  
            largest = r;  
        if (largest != i) {  
            swap(a, i, largest);  
            maxHeapify(a, largest);  
        }  
    }  
  
    private static int left(int i) {  
        return 2 * i;  
    }  
  
    private static int right(int i) {  
        return 2 * i + 1;  
    }  
}
