import java.util.LinkedList;
import java.util.Queue;

public class BFS extends Caminos{
	   private Arista edge[];
	   private double dist[];  
	 
	  
	   public BFS(Grafo g, int origen, int destino) {
	        super(g, origen, destino);
	       
	            Queue<Integer> q = new LinkedList<Integer>();
                q.add(origen);

	            while (!q.isEmpty()) {
	                int v = q.remove();
	                
	                for (int w : g.adj(v)) {
	                    if (!visitado(w)) {
	                    //    edge[w] = g. ;
	                        
	                     //   distancia[w] = true;
	                        q.add(w);
	                    }
	                }
	            }
	        }
	      
	    

	   public double distancia(int v) { return dist[v]; }
	    protected Arista edge_to(int v) { return edge[v]; }
}
