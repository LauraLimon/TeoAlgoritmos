public class MinHeap extends Heap {
	
	public MinHeap(int tamanio) {
		super(tamanio);
	}

	public MinHeap(Comparable[] elementos) {
		super(elementos);
	}

	
	protected void heapifyUp(int i) {
		if (i <= 0) {
			return;
		}

		int padre = (i - 1) / 2;
		if (elementos[i].compareTo(elementos[padre]) < 0) {
			intercambiar(i, padre);
			i = padre;
			heapifyUp(i);
		}

	}

	protected void heapifyDown(int i) {
		int hijoIzq, hijoDer, minimo;
		hijoIzq = 2 * i + 1;
		hijoDer = 2 * i + 2;
		if (hijoDer >= tamanio) {
			if (hijoIzq >= tamanio) {
				return;
			} else {
				minimo = hijoIzq;
			}

		} else {
			if (elementos[hijoIzq].compareTo(elementos[hijoDer]) <= 0) {
				minimo = hijoIzq;
			} else {
				minimo = hijoDer;
			}
		}

		if (elementos[i].compareTo(elementos[minimo]) > 0) {
			intercambiar(minimo, i);
			heapifyDown(minimo);
		}

	}

	
	public Comparable minimo() {
		return raiz();
	}

	public Comparable extraerMinimo() {
		return extraerRaiz();
	}



}
