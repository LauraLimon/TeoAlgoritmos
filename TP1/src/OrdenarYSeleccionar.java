
public class OrdenarYSeleccionar {
	public static Comparable EncontrarElemento(Comparable[] elementos, int k) {
		if (k < 0 || k > elementos.length) {
			return null;
		}
		Quicksort.sort(elementos); 
	    return elementos[k];
	}
}
