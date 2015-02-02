package algos.sorting;

public class QuickSort {
    
    static int []A = {14,2,65,88,44,33,90,67,89,22,77};
     
    public static void main(String[] args) {        
     
        int beg = 0;
        int end = A.length-1;
         
        sort(beg, end);
     
    for(int k=0; k<A.length-1; k++) {
        System.out.println(A[k]);
    }
    }
     
     
    public static void sort(int beg, int end) {
        int p = A[beg];
        int i = beg+1;
        int temp;
        for(int j=(beg+1); j<=end; j++) {
            if(A[j]<p) {
                temp = A[j];
                A[j] = A[i];
                A[i] = temp;
                i++;
            }
        }
        temp = A[beg];
        A[beg] = A[i-1];
        A[i-1] = temp;
         
        sort(0, (i-2));
        sort(i, end);
    }
 
}
