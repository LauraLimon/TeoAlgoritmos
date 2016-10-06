
public class Heap {
	private int tamanio;
	private int ultimo;
	private Comparable[] elementos;

	public Heap(int tamanio) {
		this.tamanio = tamanio;
		ultimo = 0;
		elementos = new Comparable[tamanio];
	}

	public Heap(Comparable[] elementos) {
		tamanio = elementos.length;
		ultimo = this.tamanio - 1;
		this.elementos = elementos;
		construirHeap();
	}

	public void construirHeap() {
		for (int i = tamanio / 2; i >= 0; i--) {
			heapifyDown(i);
		}
	}

	public Comparable[] elementos() {
		return this.elementos;
	}

	public int tamanio() {
		return this.tamanio;
	}

	public void Agregar(Comparable elemento) {
		elementos[ultimo] = elemento;
		heapifyUp(ultimo);
		ultimo++;

	}

	private void heapifyUp(int i) {
		if (i <= 0) {
			return;
		}

		int padre = (i) / 2;
		if (elementos[i].compareTo(elementos[padre]) == -1) {
			intercambiar(i, padre);
			i = padre;
			heapifyUp(i);
		}

	}

	private void heapifyDown(int i) {
		int hijo = i * 2;
		if (hijo > tamanio) {
			return;
		}
		if (hijo < tamanio) {
			hijo = hijoMinimo(hijo, hijo + 1);
		}
		if (elementos[hijo].compareTo(elementos[i]) < 0) {
			intercambiar(i, hijo);
			heapifyDown(hijo);

		}
	}

	private int hijoMinimo(int hijoIzq, int hijoDer) {
		if (elementos[hijoIzq].compareTo(elementos[hijoDer]) <= 0)
			return hijoIzq;
		else
			return hijoDer;
	}

	private void intercambiar(int i, int j) {
		Comparable aux = elementos[i];
		elementos[i] = elementos[j];
		elementos[j] = aux;
	}

	public Comparable minimo() {
		return elementos[0];
	}

	public Comparable extraerMinimo() {
		Comparable min = minimo();
		elementos[0] = elementos[ultimo];
		ultimo--;
		heapifyDown(0);
		return min;
	}

	public void sort(Comparable[] pq) {
		int n = tamanio;
		 for (int i = n; i > 0; i--) {
	            intercambiar(0, i);
	            n--;
	            heapifyDown(0);
	        }
	}

	public String toString() {
		String s = "";
		for (int v = 0; v < ultimo; v++) {
			s += elementos[v] + ", ";
		}
		return "(" + s + ")";
	}

}
