import java.util.Stack;

class Binary {
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<>();
		int n = 100;
		while (n != 0) {
			stack.push(n % 2);
			n = n / 2;
		}

		for (int d : stack) System.out.print(d);
		System.out.println();
	}
}