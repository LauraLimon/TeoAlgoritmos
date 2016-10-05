
import java.util.List;
import java.util.Stack;

public abstract class Caminos {
	 private int src;
	 private int dst;
	 
	    protected Caminos(Grafo g, int src, int dst) {
	    	this.src = src;
	    	this.dst = dst;
	    }

	    public abstract double distancia(int v);
	    protected abstract Arista edge_to(int v);

	    public boolean visitado(int v) {
	        return distancia(v) < Double.POSITIVE_INFINITY;
	    }
	    
	   	    
	    public List<Arista> camino() {
	    
	    	if (!visitado(dst)) return null;
	    	List<Arista> camino = new Stack<Arista>();
	    	for (Arista e = edge_to(dst); e != null; e = edge_to(e.src())) {
	    		camino.add(e);
	    	}
	    	return camino;
        }
}
