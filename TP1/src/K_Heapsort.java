public class K_Heapsort {

	public static Comparable EncontrarElemento(Comparable[] elementos, int k) {
		if (k < 0 || k > elementos.length - 1) {
			return null;
		}
	MinHeap minHeap = new MinHeap(elementos); //O(nlogn)
		for (int i = 0; i < k ; i++) {
			minHeap.extraerMinimo();  //O((k-1)logn)
		}
		return  minHeap.minimo(); //O(1)
	}
}
