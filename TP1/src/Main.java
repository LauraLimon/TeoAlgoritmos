import java.util.*;


public class Main {
	 public static void main(String[] args){
			Grafo graph = new Grafo(8);
						
		    graph.add_edge(1, 2, 2);
		    graph.add_edge(5, 4, 4);
		    graph.add_edge(1, 3, 3);
		    graph.add_edge(5, 4, 1);
		    graph.add_edge(1,5, 3);
		    
			System.out.println(graph.toString());
			
			System.out.println( graph.iter());
			
			
			System.out.println( graph.iter_edges());
			
			for (int v = 0; v < graph.v(); v++) {
				System.out.println( graph.adj_e(v));
				  			}		

		  
	 
	
	 }
}
