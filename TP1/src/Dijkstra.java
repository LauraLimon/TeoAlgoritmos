import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Dijkstra extends Caminos {
	private Arista edge[];
	private double dist[];
	private PriorityQueue<Integer> pq; // cola de prioridad

	public Dijkstra(Grafo g, int src, int dst) {
		super(g, src, dst);
		dist = new double[g.v()];
		edge = new Arista[g.v()];
		for (int v = 0; v < g.v(); v++) {
			dist[v] = v != src ? Double.POSITIVE_INFINITY : 0;
		}
		pq = new PriorityQueue<Integer>(g.v());
		pq.add(src);
		while (!pq.isEmpty()) {
			int v = pq.poll();
			if (v == dst) {
				break;
			}
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
			if (! pq.contains(w)) {
				pq.add(w);
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
        
    private class ComparadorVertices implements Comparator<Object> {
        @Override
        public int compare(Object o1, Object o2) {
            Integer nodo1 = (Integer) o1;
            Integer nodo2 = (Integer) o2;
            return Double.compare(dist[nodo1], dist[nodo2]);
        }
    }
}
