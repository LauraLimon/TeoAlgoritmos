
public class OrdernarYSeleccionar {
	public static Comparable EncontrarElemento(Comparable[] elementos, int k) {
		if (k < 0 || k > elementos.length - 1) {
			return null;
		}
		Quicksort.sort(elementos); 
	    return elementos[k];
	}
}
