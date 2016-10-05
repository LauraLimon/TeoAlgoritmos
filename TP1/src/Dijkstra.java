import java.util.Stack;

public class Dijkstra extends Caminos {
	private Arista edge[];
	private double dist[];
	private IndexMinPQ<Double> pq; // cola de prioridad

	public Dijkstra(Grafo g, int src, int dst) {
		super(g, src, dst);
		dist = new double[g.v()];
		edge = new Arista[g.v()];
		for (int v = 0; v < g.v(); v++) {
			dist[v] = v != src ? Double.POSITIVE_INFINITY : 0;
		}
		pq = new IndexMinPQ(g.v());
		pq.insert(src, dist[src]);
		while (!pq.isEmpty()) {
			int v = pq.delMin();
			if (v == dst) break;
			for (Arista e : g.adj_e(v)) {
				actualizarDistancias(e, dst);
			}

		}

	}

	private void actualizarDistancias(Arista e, int dst) {
		int v = e.src(), w = e.dst();
		if ((dist[w] > dist[v] + e.weight())) {
			dist[w] = dist[v] + e.weight();
			edge[w] = e;
			if (pq.contains(w)) {
				pq.decreaseKey(w, dist[w]);
			} else {
				pq.insert(w, dist[w]);
			}
		}
	}

	@Override
	public double distancia(int v) {
		return dist[v];

	}

	@Override
	protected Arista edge_to(int v) {
		return edge[v];

	}
}