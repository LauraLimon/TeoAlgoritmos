public class HeapSelect {

	public static Comparable EncontrarElemento(Comparable[] elementos, int k) {
		int n = elementos.length;
		if (k < 0 || k > n) {
			return null;
		}
		MaxHeap maxHeap = new MaxHeap(n);
		for (int i = 0; i < n; i++) {
			if (i <= k) {
				maxHeap.agregar(elementos[i]);
			} else {
				Comparable elemento = elementos[i];
				if (elementos[i].compareTo(maxHeap.maximo()) < 0) {
					maxHeap.extraerMaximo();
					maxHeap.agregar(elemento);
				}
			}
		}

		return maxHeap.maximo();
	}
}
