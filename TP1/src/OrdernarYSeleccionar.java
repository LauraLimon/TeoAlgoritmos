
public class OrdernarYSeleccionar {
	public static Comparable EncontrarElemento(Comparable[] elementos, int k) {
		if (k < 1 || k > elementos.length) {
			return null;
		}
		Quicksort.sort(elementos); 
	    return elementos[k - 1];
	}
}
