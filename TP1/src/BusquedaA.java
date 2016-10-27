
import java.util.LinkedList;
import java.util.PriorityQueue;

public class BusquedaA extends BusquedaHeuristica{
 
    public BusquedaA(Grafo grafo, int verticeOrigen, int verticeDestino,
            HeuristicaDistanciaInvocable heuristica) throws CaminoNoEncontradoException {
        super(grafo, verticeOrigen, verticeDestino, heuristica, true);
    }

    @Override
    public double distancia(int v) {
        return super.distancia(v);
    }

    @Override
    protected Arista edge_to(int v) {
        return super.edge_to(v);
    }
}
