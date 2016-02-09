class UnionFind {
	int [] id;
	public UnionFind(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) id[i] = i;
	}

	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}

	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];

		for (int i : id) {
			if (i == pid) i = qid; // set the id for q for all p
		}
	}
}