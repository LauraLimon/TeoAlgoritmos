
import junit.framework.TestCase;

public class FuerzaBrutaTest extends TestCase {
    private final int CANT_ELEMENTOS_CONJUNTO_MIN;
    private final int CANT_ELEMENTOS_CONJUNTO_MAX;
    private Integer[] ordenado;
    private Integer[] aleatorioChico;
    private Integer[] ordenadoInversa;
    
    public FuerzaBrutaTest(String testName) {
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
     * Test of EncontrarElemento method, of class FuerzaBruta.
     */
    public void testEncontrarElemento() {
        int[] ks = {0, CANT_ELEMENTOS_CONJUNTO_MIN -1, CANT_ELEMENTOS_CONJUNTO_MIN/2, 1};
        Integer[] resultadosK = {0, CANT_ELEMENTOS_CONJUNTO_MIN -1, CANT_ELEMENTOS_CONJUNTO_MIN/2, 1};
        int i = 0;
        for (int k : ks) {
            Integer resultadoOrdenado = (Integer) FuerzaBruta.EncontrarElemento(ordenado, k);
            assertEquals(resultadosK[i], resultadoOrdenado);
            Integer resultadoOrdenadoInv = (Integer) FuerzaBruta.EncontrarElemento(ordenadoInversa, k);
            assertEquals(resultadosK[i], resultadoOrdenadoInv);
            Integer resultadoAleatorio = (Integer) FuerzaBruta.EncontrarElemento(aleatorioChico, k);
            assertEquals(resultadosK[i], resultadoAleatorio);
            i++;
        }
    }
    
}
