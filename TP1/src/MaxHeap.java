public class MaxHeap extends Heap {
	

	public MaxHeap(int tamanio) {
		super(tamanio);
	}

	public MaxHeap(Comparable[] elementos) {
		super(elementos);
	}


	protected void heapifyUp(int i) {
		if (i <= 0) {
			return;
		}

		int padre = (i - 1) / 2;
		if (elementos[i].compareTo(elementos[padre]) > 0) {
			intercambiar(i, padre);
			i = padre;
			heapifyUp(i);
		}

	}

	protected void heapifyDown(int i) {
		int hijoIzq, hijoDer, max;
		hijoIzq = 2 * i + 1;
		hijoDer = 2 * i + 2;
		if (hijoDer >= tamanio) {
			if (hijoIzq >= tamanio) {
				return;
			} else {
				max = hijoIzq;
			}

		} else {
			if (elementos[hijoIzq].compareTo(elementos[hijoDer]) >= 0) {
				max = hijoIzq;
			} else {
				max = hijoDer;
			}
		}

		if (elementos[i].compareTo(elementos[max]) < 0) {
			intercambiar(max, i);
			heapifyDown(max);
		}

	}

	
	public Comparable maximo() {
		return raiz();
	}

	public Comparable extraerMaximo() {
		return extraerRaiz();

	}

	
}
