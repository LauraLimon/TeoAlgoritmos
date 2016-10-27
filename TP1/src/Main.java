import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public Main() {
    }
    public static void main(String[] args) throws IOException, CaminoNoEncontradoException {
        Grafo grafoNoPonderado1 = new Grafo(6);
        grafoNoPonderado1.add_edge(0, 1, 1);
        grafoNoPonderado1.add_edge(1, 0, 1);
        grafoNoPonderado1.add_edge(0, 2, 1);
        grafoNoPonderado1.add_edge(2, 0, 1);
        grafoNoPonderado1.add_edge(1, 4, 1);
        grafoNoPonderado1.add_edge(4, 1, 1);
        grafoNoPonderado1.add_edge(2, 3, 1);
        grafoNoPonderado1.add_edge(3, 2, 1);
        grafoNoPonderado1.add_edge(3, 5, 1);
        grafoNoPonderado1.add_edge(5, 3, 1);
        grafoNoPonderado1.add_edge(4, 5, 1);
        grafoNoPonderado1.add_edge(5, 4, 1);

        Grafo grafoPonderado1 = new Grafo(6);
        grafoPonderado1.add_edge(0, 1, 10);
        grafoPonderado1.add_edge(1, 0, 10);
        grafoPonderado1.add_edge(0, 2, 1);
        grafoPonderado1.add_edge(2, 0, 1);
        grafoPonderado1.add_edge(1, 4, 10);
        grafoPonderado1.add_edge(4, 1, 10);
        grafoPonderado1.add_edge(2, 3, 1);
        grafoPonderado1.add_edge(3, 2, 1);
        grafoPonderado1.add_edge(3, 5, 1);
        grafoPonderado1.add_edge(5, 3, 1);
        grafoPonderado1.add_edge(4, 5, 10);
        grafoPonderado1.add_edge(5, 4, 10);

        Grafo grafoPonderado2 = new Grafo(6);
        grafoPonderado2.add_edge(0, 1, 1);
        grafoPonderado2.add_edge(1, 0, 1);
        grafoPonderado2.add_edge(0, 2, 1);
        grafoPonderado2.add_edge(2, 0, 1);
        grafoPonderado2.add_edge(1, 3, 1);
        grafoPonderado2.add_edge(3, 1, 1);
        grafoPonderado2.add_edge(2, 4, 2);
        grafoPonderado2.add_edge(4, 2, 2);
        grafoPonderado2.add_edge(4, 5, 3);
        grafoPonderado2.add_edge(5, 4, 3);
        grafoPonderado2.add_edge(3, 5, 3);
        grafoPonderado2.add_edge(5, 3, 3);
        grafoPonderado2.add_edge(3, 4, 3);
        grafoPonderado2.add_edge(4, 3, 3);

        Grafo grafoPonderado3 = new Grafo(6);
        grafoPonderado3.add_edge(0, 1, 10);
        grafoPonderado3.add_edge(1, 0, 10);
        grafoPonderado3.add_edge(0, 2, 1);
        grafoPonderado3.add_edge(2, 0, 1);
        grafoPonderado3.add_edge(1, 3, 5);
        grafoPonderado3.add_edge(3, 1, 5);
        grafoPonderado3.add_edge(2, 4, 2);
        grafoPonderado3.add_edge(4, 2, 2);
        grafoPonderado3.add_edge(4, 5, 3);
        grafoPonderado3.add_edge(5, 4, 3);
        grafoPonderado3.add_edge(3, 5, 3);
        grafoPonderado3.add_edge(5, 3, 3);
        grafoPonderado3.add_edge(3, 4, 3);
        grafoPonderado3.add_edge(4, 3, 3);
        grafoPonderado3.add_edge(0, 4, 5);
        grafoPonderado3.add_edge(4, 0, 5);
        grafoPonderado3.add_edge(1, 2, 2);
        grafoPonderado3.add_edge(2, 1, 2);

        Grafo grafoNoPonderado2 = new Grafo(16);
        grafoNoPonderado2.add_edge(0, 1, 1);
        grafoNoPonderado2.add_edge(1, 0, 1);
        grafoNoPonderado2.add_edge(1, 2, 1);
        grafoNoPonderado2.add_edge(2, 1, 1);
        grafoNoPonderado2.add_edge(2, 3, 1);
        grafoNoPonderado2.add_edge(3, 2, 1);
        grafoNoPonderado2.add_edge(4, 5, 1);
        grafoNoPonderado2.add_edge(5, 4, 1);
        grafoNoPonderado2.add_edge(5, 6, 1);
        grafoNoPonderado2.add_edge(6, 5, 1);
        grafoNoPonderado2.add_edge(6, 7, 1);
        grafoNoPonderado2.add_edge(7, 6, 1);
        grafoNoPonderado2.add_edge(8, 9, 1);
        grafoNoPonderado2.add_edge(9, 8, 1);
        grafoNoPonderado2.add_edge(9, 10, 1);
        grafoNoPonderado2.add_edge(10, 9, 1);
        grafoNoPonderado2.add_edge(10, 11, 1);
        grafoNoPonderado2.add_edge(11, 10, 1);
        grafoNoPonderado2.add_edge(12, 13, 1);
        grafoNoPonderado2.add_edge(13, 12, 1);
        grafoNoPonderado2.add_edge(13, 14, 1);
        grafoNoPonderado2.add_edge(14, 13, 1);
        grafoNoPonderado2.add_edge(14, 15, 1);
        grafoNoPonderado2.add_edge(15, 14, 1);
        grafoNoPonderado2.add_edge(0, 4, 1);
        grafoNoPonderado2.add_edge(0, 4, 1);
        grafoNoPonderado2.add_edge(4, 8, 1);
        grafoNoPonderado2.add_edge(8, 4, 1);
        grafoNoPonderado2.add_edge(8, 12, 1);
        grafoNoPonderado2.add_edge(12, 8, 1);
        grafoNoPonderado2.add_edge(1, 5, 1);
        grafoNoPonderado2.add_edge(5, 1, 1);
        grafoNoPonderado2.add_edge(5, 9, 1);
        grafoNoPonderado2.add_edge(9, 5, 1);
        grafoNoPonderado2.add_edge(9, 13, 1);
        grafoNoPonderado2.add_edge(13, 9, 1);
        grafoNoPonderado2.add_edge(2, 6, 1);
        grafoNoPonderado2.add_edge(6, 2, 1);
        grafoNoPonderado2.add_edge(6, 10, 1);
        grafoNoPonderado2.add_edge(10, 6, 1);
        grafoNoPonderado2.add_edge(10, 14, 1);
        grafoNoPonderado2.add_edge(14, 10, 1);
        grafoNoPonderado2.add_edge(3, 7, 1);
        grafoNoPonderado2.add_edge(7, 3, 1);
        grafoNoPonderado2.add_edge(7, 11, 1);
        grafoNoPonderado2.add_edge(11, 7, 1);
        grafoNoPonderado2.add_edge(11, 15, 1);
        grafoNoPonderado2.add_edge(15, 11, 1);

        Grafo grafoPonderado4 = new Grafo(16);
        grafoPonderado4.add_edge(0, 1, 1);
        grafoPonderado4.add_edge(1, 0, 1);
        grafoPonderado4.add_edge(1, 2, 1);
        grafoPonderado4.add_edge(2, 1, 1);
        grafoPonderado4.add_edge(2, 3, 1);
        grafoPonderado4.add_edge(3, 2, 1);
        grafoPonderado4.add_edge(4, 5, 1);
        grafoPonderado4.add_edge(5, 4, 1);
        grafoPonderado4.add_edge(5, 6, 1);
        grafoPonderado4.add_edge(6, 5, 1);
        grafoPonderado4.add_edge(6, 7, 1);
        grafoPonderado4.add_edge(7, 6, 1);
        grafoPonderado4.add_edge(8, 9, 1);
        grafoPonderado4.add_edge(9, 8, 1);
        grafoPonderado4.add_edge(9, 10, 1);
        grafoPonderado4.add_edge(10, 9, 1);
        grafoPonderado4.add_edge(10, 11, 1);
        grafoPonderado4.add_edge(11, 10, 1);
        grafoPonderado4.add_edge(12, 13, 1);
        grafoPonderado4.add_edge(13, 12, 1);
        grafoPonderado4.add_edge(13, 14, 1);
        grafoPonderado4.add_edge(14, 13, 1);
        grafoPonderado4.add_edge(14, 15, 1);
        grafoPonderado4.add_edge(15, 14, 1);
        grafoPonderado4.add_edge(0, 4, 2);
        grafoPonderado4.add_edge(0, 4, 2);
        grafoPonderado4.add_edge(4, 8, 2);
        grafoPonderado4.add_edge(8, 4, 2);
        grafoPonderado4.add_edge(8, 12, 2);
        grafoPonderado4.add_edge(12, 8, 2);
        grafoPonderado4.add_edge(1, 5, 2);
        grafoPonderado4.add_edge(5, 1, 2);
        grafoPonderado4.add_edge(5, 9, 2);
        grafoPonderado4.add_edge(9, 5, 2);
        grafoPonderado4.add_edge(9, 13, 2);
        grafoPonderado4.add_edge(13, 9, 2);
        grafoPonderado4.add_edge(2, 6, 2);
        grafoPonderado4.add_edge(6, 2, 2);
        grafoPonderado4.add_edge(6, 10, 2);
        grafoPonderado4.add_edge(10, 6, 2);
        grafoPonderado4.add_edge(10, 14, 2);
        grafoPonderado4.add_edge(14, 10, 2);
        grafoPonderado4.add_edge(3, 7, 1);
        grafoPonderado4.add_edge(7, 3, 1);
        grafoPonderado4.add_edge(7, 11, 1);
        grafoPonderado4.add_edge(11, 7, 1);
        grafoPonderado4.add_edge(11, 15, 1);
        grafoPonderado4.add_edge(15, 11, 1);

        Grafo grafoNoPonderado3 = new Grafo(5);
        grafoNoPonderado3.add_edge(0, 1, 1);
        grafoNoPonderado3.add_edge(1, 0, 1);
        grafoNoPonderado3.add_edge(0, 2, 1);
        grafoNoPonderado3.add_edge(2, 0, 1);
        grafoNoPonderado3.add_edge(1, 3, 1);
        grafoNoPonderado3.add_edge(3, 1, 1);
        grafoNoPonderado3.add_edge(2, 4, 1);
        grafoNoPonderado3.add_edge(4, 2, 1);
        grafoNoPonderado3.add_edge(3, 4, 1);
        grafoNoPonderado3.add_edge(4, 3, 1);
        grafoNoPonderado3.add_edge(0, 4, 1);
        grafoNoPonderado3.add_edge(4, 0, 1);

        Grafo grafoPonderado5 = new Grafo(5);
        grafoPonderado5.add_edge(0, 1, 1);
        grafoPonderado5.add_edge(1, 0, 1);
        grafoPonderado5.add_edge(0, 2, 1);
        grafoPonderado5.add_edge(2, 0, 1);
        grafoPonderado5.add_edge(1, 3, 1);
        grafoPonderado5.add_edge(3, 1, 1);
        grafoPonderado5.add_edge(2, 4, 1);
        grafoPonderado5.add_edge(4, 2, 1);
        grafoPonderado5.add_edge(3, 4, 1);
        grafoPonderado5.add_edge(4, 3, 1);
        grafoPonderado5.add_edge(0, 4, 10);
        grafoPonderado5.add_edge(4, 0, 10);

        int origen = 0;
        int[] destinosNoPonderados = {4, 15, 4};
        int[] destinosPonderados = {5, 3, 5, 15, 4};
        Grafo[] grafosNoPonderados = {grafoNoPonderado1, grafoNoPonderado2, grafoNoPonderado3};
        Grafo[] grafosPonderados = {grafoPonderado1, grafoPonderado2, grafoPonderado3, grafoPonderado4, grafoPonderado5};

        System.out.println("Grafos no ponderados\n");
        
        for (int i = 0; i < grafosNoPonderados.length; i++) {
            System.out.printf("Grafo no ponderado %d\n", i+1);
            BFS buscadorBFS = new BFS(grafosNoPonderados[i], origen, destinosNoPonderados[i]);
            imprimirCamino(buscadorBFS, "BFS");
            
            Dijkstra buscadorDijkstra = new Dijkstra(grafosNoPonderados[i], origen, destinosNoPonderados[i]);
            imprimirCamino(buscadorDijkstra, "Dijkstra");
            
            BusquedaHeuristica buscadorHeuristica1 = new BusquedaHeuristica(grafosNoPonderados[i], origen, destinosNoPonderados[i], new Manhattan(), false);
            imprimirCamino(buscadorHeuristica1, "Heuristica Manhattan");
            
            BusquedaA buscadorA1 = new BusquedaA(grafosNoPonderados[i], origen, destinosNoPonderados[i], new Manhattan());
            imprimirCamino(buscadorA1, "Busqueda A* Manhattan");
            
            BusquedaHeuristica buscadorHeuristica2 = new BusquedaHeuristica(grafosNoPonderados[i], origen, destinosNoPonderados[i], new Optimista(), false);
            imprimirCamino(buscadorHeuristica2, "Heuristica Optimista");
            
            BusquedaA buscadorA2 = new BusquedaA(grafosNoPonderados[i], origen, destinosNoPonderados[i], new Optimista());
            imprimirCamino(buscadorA2, "Busqueda A* Optimista");
            
            BusquedaHeuristica buscadorHeuristica3 = new BusquedaHeuristica(grafosNoPonderados[i], origen, destinosNoPonderados[i], new Pesimista(), false);
            imprimirCamino(buscadorHeuristica3, "Heuristica Pesimista");
            
            BusquedaA buscadorA3 = new BusquedaA(grafosNoPonderados[i], origen, destinosNoPonderados[i], new Pesimista());
            imprimirCamino(buscadorA3, "Busqueda A* Pesimista");
        }
        
        System.out.println("Grafos ponderados\n");
        for (int i = 0; i < grafosPonderados.length; i++) {
            System.out.printf("Grafo ponderado %d\n", i+1);
            BFS buscadorBFS = new BFS(grafosPonderados[i], origen, destinosPonderados[i]);
            imprimirCamino(buscadorBFS, "BFS");
            
            Dijkstra buscadorDijkstra = new Dijkstra(grafosPonderados[i], origen, destinosPonderados[i]);
            imprimirCamino(buscadorDijkstra, "Dijkstra");
            
            BusquedaHeuristica buscadorHeuristica1 = new BusquedaHeuristica(grafosPonderados[i], origen, destinosPonderados[i], new Manhattan(), false);
            imprimirCamino(buscadorHeuristica1, "Heuristica Manhattan");
            
            BusquedaA buscadorA1 = new BusquedaA(grafosPonderados[i], origen, destinosPonderados[i], new Manhattan());
            imprimirCamino(buscadorA1, "Busqueda A* Manhattan");
            
            BusquedaHeuristica buscadorHeuristica2 = new BusquedaHeuristica(grafosPonderados[i], origen, destinosPonderados[i], new Optimista(), false);
            imprimirCamino(buscadorHeuristica2, "Heuristica Optimista");
            
            BusquedaA buscadorA2 = new BusquedaA(grafosPonderados[i], origen, destinosPonderados[i], new Optimista());
            imprimirCamino(buscadorA2, "Busqueda A* Optimista");
            
            BusquedaHeuristica buscadorHeuristica3 = new BusquedaHeuristica(grafosPonderados[i], origen, destinosPonderados[i], new Pesimista(), false);
            imprimirCamino(buscadorHeuristica3, "Heuristica Pesimista");
            
            BusquedaA buscadorA3 = new BusquedaA(grafosPonderados[i], origen, destinosPonderados[i], new Pesimista());
            imprimirCamino(buscadorA3, "Busqueda A* Pesimista");
            
        }
    }
    public static void imprimirCamino(Caminos caminos, String nombreMetodo) {
        System.out.println(nombreMetodo + "\n");
       
        Stack<Arista> camino = (Stack<Arista>) caminos.camino();
        while (!camino.empty()) {
            System.out.print(camino.pop());
        }
        System.out.println("\n");
    }
}
