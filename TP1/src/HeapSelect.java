public class HeapSelect {

	public static Comparable EncontrarElemento(Comparable[] elementos, int k) {
		int n = elementos.length;
		if (k < 1 || k > n) {
			return null;
		}
		MaxHeap maxHeap = new MaxHeap(n);
		for (int i = 0; i < n; i++) {
			if (i < k) {
				maxHeap.agregar(elementos[i]);// O(k logk)?
			} else {
				Comparable elemento = elementos[i];
				if (elementos[i].compareTo(maxHeap.maximo()) < 0) {
					maxHeap.extraerMaximo(); //O(n-k logk)?
					maxHeap.agregar(elemento);//O(n-k logk)?
				}
			}
		}

		return maxHeap.maximo();
	}
}
