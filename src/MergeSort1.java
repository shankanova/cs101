
public class   implements Sorting {

	public int[] sort(int[] A, int beg, int end ) {

		if  (A.length<=1){
				return (A);
			
		}  

		 	int[] first = new int[( beg + end) / 2];
	        int[] second = new int[A.length - first.length];
	        System.arraycopy(A, 0, first, 0, first.length);
	        System.arraycopy(A, first.length, second, 0, second.length);
		
		
			
			//int mid = A.length / 2;

			int[] B = sort(first, beg,(beg + end)/2);
			int[] C = sort(second, (beg+end)/2,  end);
			merge(A, B, C);
			
			return A;
			
			//return A;
	}

	public static int[] merge(int[] A, int[] B, int[] C) {
		int j = 0, k = 0;
		for (int i = 0; i < A.length ; i++) {
			if (j != B.length && k != C.length  && B[j] < C[k]) {
				A[i] = B[j];
				j++;
			}

			else if (j != B.length && k != C.length  && C[k] < B[j]) {
				A[i] = C[k];
				k++;
			}

			else if (j == B.length ) {
				A[i] = C[k];
				k++;
			}

			else if (k == C.length ) {
				A[i] = B[j];
				j++;
			}
		}
		return (A);
	}	
}

