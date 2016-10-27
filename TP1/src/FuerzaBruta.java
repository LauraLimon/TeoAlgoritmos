public class FuerzaBruta {
	public static Comparable EncontrarElemento(Comparable[] elementos, int k) {
		int n = elementos.length;
		if (k < 0 || k > elementos.length - 1) {
			return null;
		}

		boolean elementoEncontrado = false;
		int indiceActual = -1;
		while (!elementoEncontrado) {
			indiceActual++;
			Comparable elementoActual = elementos[indiceActual];
			int cantidadMenores = 0;
			for (int i = 0; i < n; i++) {
				if (i == indiceActual) {
					continue;
				}
				Comparable elementoAComparar = elementos[i];
				if (elementoAComparar.compareTo(elementoActual) < 0) {
					cantidadMenores++;
				} else {
					if (elementoAComparar.compareTo(elementoActual) == 0
							&& indiceActual > i) // elementos repetidos
					{
						cantidadMenores++;
					}
				}
			}
			elementoEncontrado = (cantidadMenores == k);
		}

		return elementos[indiceActual];
	}
}
