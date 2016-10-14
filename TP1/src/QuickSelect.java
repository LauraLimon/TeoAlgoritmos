public class QuickSelect {
    private static Comparable[] list;
    
    private static void swap(int i, int j) {
        Comparable aux = list[i];
        list[i] = list[j];
        list[j] = aux;
    }
    
    private static int partition(int firstIndex, int lastIndex, int pivotIndex) {
        Comparable pivotValue = list[pivotIndex];
        swap(pivotIndex, lastIndex);
        int storeIndex = firstIndex;
        for (int i = firstIndex; i < lastIndex; i++) {
            if (less(list[i], pivotValue)) {
                swap(storeIndex, i);
                storeIndex++;
            }
        }
        swap(lastIndex, storeIndex);
        return storeIndex;
    }
    
    public static Comparable EncontrarElemento(Comparable[] originalList, int k) {
        list = originalList;
        int firstIndex = 0, lastIndex = originalList.length -1;
        while (true) {
            if (firstIndex == lastIndex) {
                return list[firstIndex];
            }
            int pivotIndex = (lastIndex - firstIndex) /2 + firstIndex;
            pivotIndex = partition(firstIndex, lastIndex, pivotIndex);
            if (k == pivotIndex) {
                return list[k];
            } else if (k < pivotIndex) {
                lastIndex = pivotIndex - 1;
            } else {
                firstIndex = pivotIndex + 1;
            }
        }
    }
    
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
}
//TODO: revisar que el constructor no devuelva nada