class WeightedQuickUnion {
	int [] id;
	int [] sz;
	/**
	 * Initialize
	 * T(n) = O(n)
	 */
	public WeightedQuickUnion(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) id[i] = i;
		sz = new int[N];
		for (int i = 0; i < N; i++) sz[i] = 1;
	}

	/**
	 * Check if p and q has the same root
	 * T(n) = O(n)
	 */
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	/**
	 * Chase the pointers inside the array
	 * untill we reach to the root
	 * T(n) = O(n)
	 */
	public int root(int i) {
		while (i != id[i]) i = id[i];
		return i;
	}

	/**
	 * Get the roots of p and q
	 * Add q to p 
	 * T(n) = O(n) (Includes the cost of finding roots)
	 */
	public void union(int p, int q) {
		if (connected(p, q)) return;

		int i = root(p);
		int j = root(q);
		if (sz[i] < sz[j]) {
			id[i] = j;
			sz[j] += sz[i];
		} else {
			id[j] = i;
			sz[i] += sz[j];
		}
		printArray();
	}

	public void printArray() {
		for (int i = 0; i < id.length; i++) System.out.print(""+id[i]+" ");
		System.out.println("");
	}

	public static void main(String args[]) {
		WeightedQuickUnion wqu = new WeightedQuickUnion(10);
		wqu.printArray();
		wqu.union(6, 3);
		wqu.union(7, 2);
		wqu.union(5, 7);
		wqu.union(4, 9);
		wqu.union(9, 3);
		wqu.union(7, 0);
		wqu.union(2, 8);
		wqu.union(2, 3);
		wqu.union(1, 2);
		wqu.printArray();
	}
}