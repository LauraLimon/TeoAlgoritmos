import java.util.*;


public class Main {
	 public static void main(String[] args){
			Grafo graph = new Grafo(8);
						
		    graph.addEdge(1, 2, 2);
		    graph.addEdge(5, 4, 4);
		    graph.addEdge(1, 3, 3);
		    graph.addEdge(5, 4, 1);
		    graph.addEdge(1,5, 3);
		    
			System.out.println(graph.toString());
			
	
		  }
}
