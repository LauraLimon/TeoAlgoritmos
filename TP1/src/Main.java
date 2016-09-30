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
			
			
			Heap heap = new Heap(9);
			heap.Agregar(11);
			heap.Agregar(15);
			heap.Agregar(8);
			heap.Agregar(10);
			System.out.println(heap.toString());
		  }
	 
	
}
