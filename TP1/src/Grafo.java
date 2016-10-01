import java.util.ArrayList;
import java.util.HashMap;

public class Grafo {

	private int V;
	private int E;
	private HashMap<Integer, ArrayList<Arista>> adj;

	 public Grafo(int V) {
		 if (V < 0) throw new IllegalArgumentException("El número de vértices no puede ser negativo");
	        this.V = V;
	        this.E = 0;
	        adj = new HashMap<Integer, ArrayList<Arista>>();
	        for (int v = 0; v < V; v++) {
	        	 adj.put(v, new ArrayList<Arista>());;
	        }
	    }
	
	
	    public int V() {
	        return V;
	    }

	    
	    public int E() {
	        return E;
	    }

	    
	    private void validateVertex(int v) {
	    	if (!adj.containsKey(v)) {
	            throw new IndexOutOfBoundsException("El vértice ingresado es inválido");}
	    }
	    
	    
	    public void addEdge(int v, int w, int peso) {
	        validateVertex(v);
	        validateVertex(w);
	        E++;
			adj.get(v).add(new Arista(v, w, peso));
			       
	    }
	
	    public void addEdge(int v, int w) {
	         addEdge(v, w, 0);
		}
	    
	    
	    public ArrayList<Arista> adj_e(int v)
	    {
	    	return adj.get(v);
	    }
	    
	    public ArrayList<Integer> adj(int v)
	    {
	    	ArrayList<Integer> adj = new ArrayList<Integer>();
	    	ArrayList<Arista> aristasAdj = this.adj.get(v); 
	    	for (int i=0; i< aristasAdj.size(); i++){
	    		adj.add(aristasAdj.indexOf(i));
	    	 } 
           return adj;    
	    }
	    
	    
	    
	    
	    
	    
	  
	
	    public String toString() {
			String s = "";
			for (int v = 0; v < V; v++) {
	            s += v;
				s += " : ";
				s += adj.get(v);
				s += "\n";
			}
			return s;
		}
}