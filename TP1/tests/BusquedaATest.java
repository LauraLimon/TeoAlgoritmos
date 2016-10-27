/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Stack;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 *
 * @author chicas
 */
public class BusquedaATest extends TestCase {
    Grafo grafoCuadrado;
    BusquedaA buscadorA;
    int origen;
    int destino;
    
    public BusquedaATest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        origen = 0;
        destino = 8;
        grafoCuadrado = new Grafo(9);
        grafoCuadrado.add_edge(0, 1, 10);
        grafoCuadrado.add_edge(1, 2, 10);
        grafoCuadrado.add_edge(3, 4, 10);
        grafoCuadrado.add_edge(4, 5, 10);
        grafoCuadrado.add_edge(6, 7, 1);
        grafoCuadrado.add_edge(7, 8, 1);
        grafoCuadrado.add_edge(0, 3, 1);
        grafoCuadrado.add_edge(3, 6, 1);
        grafoCuadrado.add_edge(1, 4, 10);
        grafoCuadrado.add_edge(4, 7, 10);
        grafoCuadrado.add_edge(2, 5, 10);
        grafoCuadrado.add_edge(5, 8, 10);
        
        buscadorA = new BusquedaA(grafoCuadrado, origen, destino, new Manhattan());
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of distancia method, of class BusquedaA.
     */
    public void testDistancia() {
        assertEquals(4.0, buscadorA.distancia(destino));
        assertEquals(3.0, buscadorA.distancia(7));
        assertEquals(20.0, buscadorA.distancia(2));
        assertEquals(0.0, buscadorA.distancia(origen));
    }

    /**
     * Test of edge_to method, of class BusquedaA.
     */
    public void testEdge_to() {
        Stack<Arista> camino = (Stack<Arista>) buscadorA.camino();
        assertNotNull(camino);
        int verticeAnterior = origen, i = 1;
        int[] caminoEsperado = {0, 3, 6, 7, 8};
        
        while (! camino.empty()) {
            Arista aristaActual = camino.pop();
            assertEquals(verticeAnterior, aristaActual.src());
            assertEquals(caminoEsperado[i], aristaActual.dst());
            verticeAnterior = aristaActual.dst();
            i++;
        }
    }
    
}
