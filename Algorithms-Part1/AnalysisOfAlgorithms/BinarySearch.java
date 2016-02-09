import java.util.Scanner;

class BinarySearch {

	public static int binarySearch(int A[], int low, int high, int key) {
		if (low > high) return -1;
		int mid = low + (high - low)/2;
		if (key == A[mid]) return mid;
		else if (key < A[mid])
			return binarySearch(A, low, mid - 1, key);
		else if (key > A[mid])
			return binarySearch(A, mid + 1, high, key);
		else
			return -1;
	}

   /**
 	* Search with the middle element as the key
 	* reducing the search size by half
 	* T(n) = 1 + lgn
 	*/
	public static int binarySearch(int A[], int key) {
		int lo = 0, hi = A.length - 1, mid = 0;
		while (lo <= hi) {
			mid = lo + (hi - lo)/2;
			//System.out.println("lo = " + lo + " mid = " + mid + " hi = " + hi);
			if (key == A[mid]) return mid;
			else if (key < A[mid]) hi = mid - 1;
			else if (key > A[mid]) lo = mid + 1;
		}
		return -1;
	}

	public static void main(String args[]) {
		int n, i = 0, key;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		n = scanner.nextInt();
		System.out.println("Enter the array: ");
		int [] A = new int[n];
		while (i != n) {
			A[i++] = scanner.nextInt();
		}
		System.out.print("Enter key: ");
		key = scanner.nextInt();

		//int found =  binarySearch(A, 0, n-1, key);
		int found =  binarySearch(A, key);
		if (found == -1)
		 	System.out.println("Element not found in the array");
		else
			System.out.println("Element found at: " + found);
	}
}