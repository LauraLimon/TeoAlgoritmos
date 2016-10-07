public class K_Selecciones {

	public static Comparable EncontrarElemento(Comparable[] elementos, int k) {

		for (int i = 0; i < k; i++) {
			int n = elementos.length;
			int minimo = i;
			for (int j = i + 1; j < n; j++) {
				if (elementos[j].compareTo(elementos[minimo]) < 0) {
					minimo = j;
				}
			}
			Comparable elemento = elementos[i];
			elementos[i] = elementos[minimo];
			elementos[minimo] = elemento;
		}
		return elementos[k - 1];
	}

}
