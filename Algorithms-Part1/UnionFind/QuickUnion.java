class QuickUnion {
	int [] id;

	/**
	 * Initialize
	 * T(n) = O(n)
	 */
	public QuickUnion(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) id[i] = i;
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
		int rootp = root(p);
		int rootq = root(q);

		id[rootp] = rootq;
	}
}