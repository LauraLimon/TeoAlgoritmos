public abstract class Heap {
	protected int tamanio;
	protected Comparable[] elementos;

	public Heap(int tamanio) {
		this.tamanio = 0;
		elementos = new Comparable[tamanio];
	}

	public Heap(Comparable[] elementos) {
		tamanio = elementos.length;
		this.elementos = elementos;
		construirHeap();
	}

	private void construirHeap() {
		for (int i = tamanio / 2; i >= 0; i--) {
			heapifyDown(i);
		}
	}

	
	protected abstract void heapifyUp(int i);

	protected abstract void heapifyDown(int i);

	protected void intercambiar(int i, int j) {
		Comparable aux = elementos[i];
		elementos[i] = elementos[j];
		elementos[j] = aux;
	}

	public void agregar(Comparable elemento) {
		elementos[tamanio] = elemento;
		heapifyUp(tamanio);
		tamanio++;

	}

	public Comparable extraerRaiz() {
		Comparable raiz = raiz();
		tamanio--;
		elementos[0] = elementos[tamanio];
		heapifyDown(0);
		return raiz;

	}

	public Comparable raiz() {
		return elementos[0];
	}

	public String toString() {
		String s = "";
		for (int v = 0; v < tamanio; v++) {
			s += elementos[v] + ", ";
		}
		return "(" + s + ")";
	}
}
