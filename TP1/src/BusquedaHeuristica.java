
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BusquedaHeuristica extends Caminos {
    private Arista aristas[];
    private double dist[];
    double[] distAproxPasandoV;
 
    public BusquedaHeuristica(Grafo grafo, int verticeOrigen, int verticeDestino, 
            HeuristicaDistanciaInvocable heuristica, boolean incluirPesos)
            throws CaminoNoEncontradoException {
        super(grafo, verticeOrigen, verticeDestino);
        LinkedList<Integer> setCerrado = new LinkedList<Integer>();
        PriorityQueue<Integer> setAbierto = new PriorityQueue<Integer>(1, new ComparadorNodos());
        setAbierto.add(verticeOrigen);
        
        dist = new double[grafo.v()];
        distAproxPasandoV = new double[grafo.v()];
        aristas = new Arista[grafo.v()];

        for (int v = 0; v < grafo.v(); v++) {
            dist[v] = Double.POSITIVE_INFINITY;
            distAproxPasandoV[v] = Double.POSITIVE_INFINITY; //fscore
        }
        dist[verticeOrigen] = 0;
        distAproxPasandoV[verticeOrigen] = heuristica.distanciaAlFinal(grafo, verticeOrigen, verticeDestino);

        while (! setAbierto.isEmpty()) {
            int verticeActual = setAbierto.poll();//the node in openSet having the lowest fScore[] value
            if (verticeActual == verticeDestino) {
                return;
            }

            setCerrado.add(verticeActual);
            for (Arista arista : grafo.adj_e(verticeActual)) {
                int verticeVecino = arista.dst();
                if (setCerrado.contains(verticeVecino)) {
                    continue;
                }
                
                double distAprox = dist[verticeActual];
                distAprox += (incluirPesos) ? arista.weight() : 1;
                
                if (! setAbierto.contains(verticeVecino)) {
                    setAbierto.add(verticeVecino);
                } else if (distAprox >= dist[verticeVecino]) {
                    continue;
                }

                aristas[verticeActual] = arista;
                dist[verticeVecino] = distAprox;
                distAproxPasandoV[verticeVecino] = dist[verticeVecino] + 
                        heuristica.distanciaAlFinal(grafo, verticeVecino, verticeDestino);
                
            }
        }
        throw new CaminoNoEncontradoException();
    }
    
    @Override
    public double distancia(int v) {
        return dist[v];
    }
    
    @Override
    protected Arista edge_to(int v) {
        return aristas[v];
    }
    
    private class ComparadorNodos implements Comparator<Object> {
        @Override
        public int compare(Object o1, Object o2) {
            Integer nodo1 = (Integer) o1;
            Integer nodo2 = (Integer) o2;
            return Double.compare(distAproxPasandoV[nodo1], distAproxPasandoV[nodo2]);
        }
    }

}
