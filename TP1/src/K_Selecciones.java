public class K_Selecciones {

	public static Comparable EncontrarElemento(Comparable[] elementos, int k) {
		int i, j, minIndex;
		if (k < 0 || k > elementos.length - 1) {
			return null;
		}
		
		for (i = 0; i <= k; i++) {
			minIndex = i;
			for (j = i + 1; j < elementos.length; j++) {
				if (elementos[j].compareTo(elementos[minIndex]) < 0) {
					minIndex = j;
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
