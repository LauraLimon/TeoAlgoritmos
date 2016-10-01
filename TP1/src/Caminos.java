
public abstract class Caminos {
	 private int origen;

	    protected Caminos(Grafo g, int origen) {
	    	this.origen = origen;
	    }

	    public abstract double distancia(int v);
	    protected abstract Arista edge_to(int v);

	    public boolean visitado(int v) {
	        return distancia(v) < Double.POSITIVE_INFINITY;
	    }
	    
	   // public List<Integer> Camino 
}
