/*

This is a demo task.

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that 
does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
        
*/

package task.smallest_positive_integer;
import java.util.*;

public class SmallestPositiveInteger {
	
	public int solution(int[] A) {
		
		int minInteger = 1;
		
		if (A.length == 0)
			return minInteger;
		
		Arrays.sort(A);
		
		if (A[0] > 1) 
			return minInteger;
		if (A[A.length - 1] <= 0)
			return minInteger;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] == minInteger) {
				minInteger++;
			}
		}

		return minInteger;
	}

	public static void main(String[] args) {
		
		int A[] = {1, 3, 2, 4, 6};
		System.out.print("Array:[");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
		}
		System.out.print("]\n");
		SmallestPositiveInteger n = new SmallestPositiveInteger();
		System.out.println("Smallest positive integer is " + n.solution(A));
	}
}

