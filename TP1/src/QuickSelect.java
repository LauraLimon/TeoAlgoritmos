public class QuickSelect {
    private static Comparable[] lista;
    
    private static void swap(int i, int j) {
        Comparable aux = lista[i];
        lista[i] = lista[j];
        lista[j] = aux;
    }
    
    private static int particionar(int primerIndice, int ultimoIndice, int indicePivote) {
        Comparable valorPivote = lista[indicePivote];
        swap(indicePivote, ultimoIndice);
        int indiceCambiar = primerIndice;
        for (int i = primerIndice; i < ultimoIndice; i++) {
            if (menor(lista[i], valorPivote)) {
                swap(indiceCambiar, i);
                indiceCambiar++;
            }
        }
        swap(ultimoIndice, indiceCambiar);
        return indiceCambiar;
    }
    
    public static Comparable EncontrarElemento(Comparable[] listaOriginal, int k) {
        lista = listaOriginal;
        int primerIndice = 0, ultimoIndice = listaOriginal.length -1;
        while (true) {
            int indicePivote = (ultimoIndice - primerIndice) /2 + primerIndice;
            indicePivote = particionar(primerIndice, ultimoIndice, indicePivote);
            if (k == indicePivote) {
                return lista[k];
            } else if (k < indicePivote) {
                ultimoIndice = indicePivote - 1;
            } else {
                primerIndice = indicePivote + 1;
            }
        }
    }
    
    private static boolean menor(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
}
