
import static java.lang.Math.sqrt;

public class Manhattan implements HeuristicaDistanciaInvocable {

    @Override
    public int distanciaAlFinal(Grafo grafo, int origen, int destino) {
        int anchoGrafo = (int) sqrt(grafo.v());
        int xOrigen = origen % anchoGrafo, yOrigen = origen / anchoGrafo;
        int xDestino = destino % anchoGrafo, yDestino = destino / anchoGrafo;
        return Math.abs(xOrigen - xDestino) + Math.abs(yOrigen - yDestino);
    }
    
}
