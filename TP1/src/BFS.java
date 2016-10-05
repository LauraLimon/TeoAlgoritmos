
import java.util.LinkedList;
import java.util.Queue;

public class BFS extends Caminos {
	private Arista edge[];
	private double dist[];

	public BFS(Grafo g, int src, int dst) {
		super(g, src, dst);
		Queue<Integer> q = new LinkedList<Integer>();
		dist = new double[g.v()];
		edge = new Arista[g.v()];
		for (int v = 0; v < g.v(); v++) {
			dist[v] = v != src ? Double.POSITIVE_INFINITY : 0;
		}
		dist[src] = 0;
		q.add(src);
       
		while (!q.isEmpty()) {
			int v = q.remove();
			for (Arista e : g.adj_e(v)) {
				int w = e.dst();
				if (!visitado(w)) {
					edge[w] = e;
					dist[w] = dist[v] + 1;
					q.add(w);
				}
					
				
			}
		}
		
	    

	}

	public double distancia(int v) {
		return dist[v];
	}

	protected Arista edge_to(int v) {
		return edge[v];
	}
}
