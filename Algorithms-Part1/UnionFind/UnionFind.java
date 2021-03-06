class QuickFind {
	int [] id;

	/**
	 * Initialize
	 * T(n) = O(n)
	 */
	public QuickFind(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) id[i] = i;
	}

	/**
	 * Check if p is connected with q
	 * T(n) = O(1)
	 */
	public boolean find(int p, int q) {
		return id[p] == id[q];
	}

	/**
	 * Get the ids of p and q
	 * Loop through the id and set q for all p
	 * T(n) = O(n)
	 */
	public void slowUnion(int p, int q) {
		int pid = id[p];
		int qid = id[q];

		for (int i : id) {
			if (i == pid) i = qid; // set the id for q for all p
		}
	}

	public static void main(String args[]) {

	}
}