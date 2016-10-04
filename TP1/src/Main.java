import java.util.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * Grafo graph = new Grafo(8);
		 * 
		 * graph.add_edge(1, 2, 2); graph.add_edge(5, 4, 4); graph.add_edge(1,
		 * 3, 3); graph.add_edge(5, 4, 1); graph.add_edge(1,5, 3);
		 * 
		 * System.out.println(graph.toString());
		 * 
		 * System.out.println( graph.iter());
		 * 
		 * 
		 * System.out.println( graph.iter_edges());
		 * 
		 * for (int v = 0; v < graph.v(); v++) { System.out.println(
		 * graph.adj_e(v)); }
		 */

		/**
		 * Unit tests the {@code DijkstraSP} data type.
		 *
		 * @param args
		 *            the command-line arguments
		 */

		Grafo g2 = new Grafo(6);
		g2.add_edge(4, 0, 2);
		g2.add_edge(4, 0, 3);
		g2.add_edge(2, 0, 50);
		g2.add_edge(1, 2, 2);
		g2.add_edge(1, 2, 5);
		g2.add_edge(1, 4, 32);
		g2.add_edge(1, 5, 80);
		g2.add_edge(2, 3, 60);
		g2.add_edge(3, 5, 5);
		g2.add_edge(4, 3, 25);
		g2.add_edge(4, 5, 75);
		g2.add_edge(5, 4, 10);

		int origen = 1;

		for (int v = 0; v < g2.v(); v++) {
			Dijkstra sp = new Dijkstra(g2, origen, v);
			Stack<Arista> camino = (Stack<Arista>) sp.camino();
			if (camino != null) {
				System.out.printf("%d a  %d (%.2f)  ", origen, v, sp.distancia(v));
				while (!camino.empty()) {
					System.out.print(camino.pop());

				}
				System.out.println(" ");
			} else {
				System.out.printf("%d to %d  no hay camino\n", origen, v);

			}

		}

	}
}
