 import java.util.Arrays;
class ThreeSum {

	public static void threeSum(int A[]) {
		int n = A.length;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				for (int k = j + 1; k < n; k++)
					if (A[i] + A[j] + A[k] == 0) {
						System.out.println(A[i] + "->" + i + " " + A[j] + "->" + j + " " + A[k] + "->" + k);
					}
	}

	/**
	 * Uses binary search
	 * T(n) = N^2lgN
	 */
	public static void threeSumDelux(int A[]) {
		Arrays.sort(A);
		int n = A.length;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++) {
				int found = Arrays.binarySearch(A, -1*(A[i] + A[j]));
				if (found >= 0) {
					System.out.println(A[i] + "->" + i + " " + A[j] + "->" + j + " " + A[found] + "->" + found);
				}
			}
	}


	public static void main(String args[]) {
		int [] A = {30, -40, -20, -10, 40, 0, 10, 5};
		System.out.println("Using normal threeSum");
		threeSum(A);
		System.out.println("Using normal threeSumDelux");
		threeSumDelux(A);
	}
}