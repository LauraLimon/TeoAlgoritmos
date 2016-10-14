/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import junit.framework.TestCase;

/**
 *
 * @author chicas
 */
public class K_SeleccionesTest extends TestCase {
    private final int CANT_ELEMENTOS_CONJUNTO_MIN;
    private final int CANT_ELEMENTOS_CONJUNTO_MAX;
    private Integer[] ordenado;
    private Integer[] aleatorioChico;
    private Integer[] aleatorioGrande1;
    private Integer[] aleatorioGrande2;
    private Integer[] aleatorioGrande3;
    private Integer[] aleatorioGrande4;
    private Integer[] ordenadoInversa;
    
    public K_SeleccionesTest(String testName) {
        super(testName);
        this.CANT_ELEMENTOS_CONJUNTO_MIN = 16;
        this.CANT_ELEMENTOS_CONJUNTO_MAX = 500;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ordenado = new Integer[CANT_ELEMENTOS_CONJUNTO_MIN];
        ordenadoInversa = new Integer[CANT_ELEMENTOS_CONJUNTO_MIN];
        aleatorioChico = new Integer[CANT_ELEMENTOS_CONJUNTO_MIN];
        aleatorioGrande1 = new Integer[CANT_ELEMENTOS_CONJUNTO_MAX];
        aleatorioGrande2 = new Integer[CANT_ELEMENTOS_CONJUNTO_MAX];
        aleatorioGrande3 = new Integer[CANT_ELEMENTOS_CONJUNTO_MAX];
        aleatorioGrande4 = new Integer[CANT_ELEMENTOS_CONJUNTO_MAX];
        
        Random rand = new Random();
        for (int i = 0; i < CANT_ELEMENTOS_CONJUNTO_MIN; i++) {
            ordenado[i] = i;
            ordenadoInversa[CANT_ELEMENTOS_CONJUNTO_MIN - i -1] = i;
            aleatorioChico[i] = rand.nextInt(CANT_ELEMENTOS_CONJUNTO_MIN);
        }
        for (int i = 0; i < CANT_ELEMENTOS_CONJUNTO_MAX; i++) {
            aleatorioGrande1[i] = rand.nextInt(CANT_ELEMENTOS_CONJUNTO_MAX);
            aleatorioGrande2[i] = rand.nextInt(CANT_ELEMENTOS_CONJUNTO_MAX);
            aleatorioGrande3[i] = rand.nextInt(CANT_ELEMENTOS_CONJUNTO_MAX);
            aleatorioGrande4[i] = rand.nextInt(CANT_ELEMENTOS_CONJUNTO_MAX);
        }
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of EncontrarElemento method, of class K_Selecciones.
     */
    public void testEncontrarElemento() {
        int[] ks = {0, CANT_ELEMENTOS_CONJUNTO_MIN -1, CANT_ELEMENTOS_CONJUNTO_MIN/2, 1};
        Integer[] resultadosK = {0, CANT_ELEMENTOS_CONJUNTO_MIN -1, CANT_ELEMENTOS_CONJUNTO_MIN/2, 1};
        int i = 0;
        for (int k : ks) {
            Comparable resultadoOrdenado = K_Selecciones.EncontrarElemento(ordenado, k);
            assertEquals(resultadosK[i], resultadoOrdenado);
            Integer resultadoOrdenadoInv = (Integer) K_Selecciones.EncontrarElemento(ordenadoInversa, k);
            assertEquals(resultadosK[i], resultadoOrdenadoInv);
            Integer resultadoAleatorio = (Integer) K_Selecciones.EncontrarElemento(aleatorioChico, k);
            assertEquals(resultadosK[i], resultadoAleatorio);
            i++;
        }
        
        int[] ksGrande = {0, CANT_ELEMENTOS_CONJUNTO_MAX -1, CANT_ELEMENTOS_CONJUNTO_MAX/2, 1};
        Integer[] resultadosKGrande = {0, CANT_ELEMENTOS_CONJUNTO_MAX -1, CANT_ELEMENTOS_CONJUNTO_MAX/2, 1};
        i = 0;
        for (int k : ksGrande) {
            Integer resultadoAleatorio1 = (Integer) K_Selecciones.EncontrarElemento(aleatorioGrande1, k);
            assertEquals(resultadosKGrande[i], resultadoAleatorio1);
            Integer resultadoAleatorio2 = (Integer) K_Selecciones.EncontrarElemento(aleatorioGrande2, k);
            assertEquals(resultadosKGrande[i], resultadoAleatorio2);
            Integer resultadoAleatorio3 = (Integer) K_Selecciones.EncontrarElemento(aleatorioGrande3, k);
            assertEquals(resultadosKGrande[i], resultadoAleatorio3);
            Integer resultadoAleatorio4 = (Integer) K_Selecciones.EncontrarElemento(aleatorioGrande4, k);
            assertEquals(resultadosKGrande[i], resultadoAleatorio4);
            i++;
        }
    }
    
}
