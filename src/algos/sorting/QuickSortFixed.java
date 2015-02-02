package algos.sorting;
public class QuickSortFixed {     
    
    public static void main(String[] args) {     
    	int []A = {14,2,65,88,44,33,90,67,89,22,77};
        int beg = 0;
        int end = A.length-1;
         
        sort(A, beg, end);
     
    for(int k=0; k<=A.length-1; k++) {
        System.out.println(A[k]);
    }
    }
     
     
    public static void swap(int[] A, int i, int j)
    {
    	if (i==j) return;
    	int temp;
        temp = A[j];
        A[j] = A[i];
        A[i] = temp;
    }
    
    public static void sort(int[] A, int beg, int end) {
    	// base case: nothing to do if region to sort is empty or single element
    	if (beg >= end) { return; }
    	
        int pivot_index = partial_sort(A, beg, end);
        // sort the left half
        sort(A, 0, (pivot_index-1));
        // sort the right half
        sort(A, pivot_index+1, end);
    }


    /**
     * Partially sorts the array A between the index points beg and end using the first element as the pivot point
     * @param A : the array to sort
     * @param beg : the starting index
     * @param end : the ending index
     * @return the pivot_index at which the pivot element is now located
     */
	private static int partial_sort(int[] A, int beg, int end) {
		int p = A[beg]; // pick the first element as the pivot
        int pivot_point = beg+1;
        for(int j=pivot_point; j<=end; j++) {
            if(A[j]<p) {
            	swap(A, j, pivot_point);
                pivot_point++;
            }
        }
        swap(A, pivot_point-1, beg);
        return pivot_point-1;
	}
 
}
