class QuickFind {
	int [] id;
	int size;
	public QuickFind(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) id[i] = i;
	}

	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}

	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];

		for (int i = 0; i < id.length; i++)
			if (id[i] == pid) id[i] = qid; // set the id for q for all p
	}

	public void printArray() {
		for (int i = 0; i < id.length; i++) System.out.print(""+id[i]+" ");
		System.out.println("");
	}

	public static void main(String args[]) {
		QuickFind qf = new QuickFind(10);
		qf.printArray();
		qf.union(1, 9);
		qf.union(6, 0);
		qf.union(4, 5);
		qf.union(2, 9);
		qf.union(9, 7);
		qf.union(3, 6);
		System.out.println("Result: ");
		qf.printArray();
	}
}