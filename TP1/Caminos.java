import java.util.List;
import java.util.Stack;

public abstract class Caminos {
	 private int src;

	    protected Caminos(Grafo g, int src) {
	    	this.src = src;
	    }

	    public abstract double distancia(int v);
	    protected abstract Arista edge_to(int v);

	    public boolean visitado(int v) {
	        return distancia(v) < Double.POSITIVE_INFINITY;
	    }
	    
	   	    
	    public List<Arista> camino(int v) {
	    
	    	if (distancia(v) >= Double.POSITIVE_INFINITY) return null;
	    	List<Arista> camino = new Stack<Arista>();
	    	for (Arista e = edge_to(v); e != null; e = edge_to(e.src())) {
	    		camino.add(e);
	    	}
	    	return camino;
        }
}
