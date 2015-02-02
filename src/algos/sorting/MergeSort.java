package algos.sorting;
import java.util.Scanner;

public class MergeSort {


	public static int[] mergeSort(int [] A)
	{
		if(A.length==1)
			return A;
		else
		{
			int n = A.length/2;
			int B [] = new int [n];
			int C [] = new int [A.length-n];
			int i;
			for (i=0; i<A.length; i++)
			{
				if (i<n)
					B[i] = A[i];
				else
					C[i-n] = A[i];
			}
			B = mergeSort(B);
			C = mergeSort(C);
			A = FinalMerge(B,C);
			return A;
		}

	}
	public static int [] FinalMerge(int [] A, int [] B)
	{
		int C [] = new int [A.length + B.length];
		int i, j=0, k=0;
		for (i=0; i<A.length+B.length; i++)
		{
			if (j==A.length)
			{
				C [i] = B [i];
				k++;
			}
			else if (k==B.length)
			{
				j++;
			}
			else if (A[i] > B[i])
			{
				C [i] = B[i];
				k++;	
			}
			else
			{
				C [i] = A [i];
				j++;
			}
		}
		return C;
	}
	
	public static void main(String[] args) {

		int length;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		length = input.nextInt();
		int A [] = new int[length];
		int i;

		for (i=0; i<length; i++)
		{
			A[i] = input.nextInt();
			System.out.println(A[i] + " ");
		}
		A = mergeSort(A);
		System.out.println(A[i] + " ");
	}



	
}