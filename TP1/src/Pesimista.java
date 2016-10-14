public class Pesimista implements HeuristicaDistanciaInvocable{

    @Override
    public int distanciaAlFinal(Grafo grafo, int verticeOrigen, int verticeDestino) {
        return grafo.v();
    }
    
}
