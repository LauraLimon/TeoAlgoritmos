public class K_Heapsort {
    public static Comparable EncontrarElemento(Comparable[] elementos, int k) {
        MinHeap heap = new MinHeap(elementos);
        Comparable minimoI = null;
        for (int i = 0; i < elementos.length && i < k; i++) {
            minimoI = heap.extraerMinimo();
        }
        return minimoI;
    }
}
