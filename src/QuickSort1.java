
public class QuickSort1 implements Sorting {

	    
	   
	      
	    public static void swap(int[] A, int i, int j)
	    {
	        if (i==j) return;
	        int temp;
	        temp = A[j];
	        A[j] = A[i];
	        A[i] = temp;
	    }
	     
	    public int[] sort(int[] A, int beg, int end) {
	        // base case: nothing to do if region to sort is empty or single element
	        if (beg >= end)
	        {
	        	return A;
	        }
	         
	        int pivot_index = partial_sort(A, beg, end);
	        // sort the left half
	        sort(A, 0, (pivot_index-1));
	        // sort the right half
	        sort(A, pivot_index+1, end);
	        return A;
	    }
	 
	 
	    
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

