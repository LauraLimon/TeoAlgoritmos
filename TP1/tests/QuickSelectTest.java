/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import junit.framework.TestCase;

/**
 *
 * @author chicas
 */
public class QuickSelectTest extends TestCase {
    private final int CANT_ELEMENTOS_CONJUNTO_MIN;
    private Integer[] ordenado;
    private Integer[] aleatorioChico;
    private Integer[] ordenadoInversa;
    
    public QuickSelectTest(String testName) {
        super(testName);
        this.CANT_ELEMENTOS_CONJUNTO_MIN = 16;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ordenado = new Integer[CANT_ELEMENTOS_CONJUNTO_MIN];
        ordenadoInversa = new Integer[CANT_ELEMENTOS_CONJUNTO_MIN];
        aleatorioChico = new Integer[CANT_ELEMENTOS_CONJUNTO_MIN];
        
        int[] mezclados = {8, 4, 0, 7, 6, 1, 11, 10, 5, 13, 3, 2, 14, 12, 15, 9};
        for (int i = 0; i < CANT_ELEMENTOS_CONJUNTO_MIN; i++) {
            ordenado[i] = i;
            ordenadoInversa[CANT_ELEMENTOS_CONJUNTO_MIN - i -1] = i;
            aleatorioChico[i] = mezclados[i];
        }
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of encontrarElemento method, of class QuickSelect.
     */
    public void testEncontrarElemento() {
        int[] ks = {0, CANT_ELEMENTOS_CONJUNTO_MIN -1, CANT_ELEMENTOS_CONJUNTO_MIN/2, 1};
        Integer[] resultadosK = {0, CANT_ELEMENTOS_CONJUNTO_MIN -1, CANT_ELEMENTOS_CONJUNTO_MIN/2, 1};
        int i = 0;
        for (int k : ks) {
            Comparable resultadoOrdenado = QuickSelect.EncontrarElemento(ordenado, k);
            assertEquals(resultadosK[i], resultadoOrdenado);
            Integer resultadoOrdenadoInv = (Integer) QuickSelect.EncontrarElemento(ordenadoInversa, k);
            assertEquals(resultadosK[i], resultadoOrdenadoInv);
            Integer resultadoAleatorio = (Integer) QuickSelect.EncontrarElemento(aleatorioChico, k);
            assertEquals(resultadosK[i], resultadoAleatorio);
            i++;
        }
    }
    
}
