package set.disjoint;
/**
 * Amortized O(alpha(n)) or inverse Ackerman, grows very slowly.
 * Which is, according to Sedgewick, almost linear.
 * O(n) space.
 */
public class QuickUnion {

	int[] parent;
	
	public QuickUnion(int n) {
		parent = new int[n+1];
		for (int i = 0; i <= n; i++) {
			parent[i] = i;
		}
	}
	
	public int root(int i) {
		while (i != parent[i]) {
			parent[i] = parent[parent[i]];
			i = parent[i];
		}
		return i;
	}
	
	public void union(int p, int q) {
		int rp = root(p);
		int rq = root(q);
		
		parent[rp] = rq;
	}
}
