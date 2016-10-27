public class K_Selecciones {

	public static Comparable EncontrarElemento(Comparable[] elementos, int k) {

		for (int i = 0; i <= k; i++) {
			int n = elementos.length;
			int minimo = i;
			for (int j = i + 1; j < n; j++) {
				if (elementos[j].compareTo(elementos[minimo]) < 0) {
					minimo = j;
				}
			}
			if (minIndex != i) {
				Comparable aux = elementos[i];
				elementos[i] = elementos[minIndex];
				elementos[minIndex] = aux;

			}

		}

		return elementos[k];

	}
}
