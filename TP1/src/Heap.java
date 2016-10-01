

public class Heap {
	   private int tamanio;   
	   private int ultimo;   
	   private Comparable[] elementos;
	   
  
    public Heap(int tamanio) { 
    	this.tamanio = tamanio;   
    	ultimo = 0;
        elementos = new Comparable[tamanio];
    }
    
  /*  public Heap(Comparable[] elementos){
    	tamanio = elementos.length;
    	this.elementos = elementos;
    	
    }*/
    
    public void Agregar(Comparable elemento){
       	elementos[ultimo] = elemento;
      	HeapifyUp(ultimo);
      	ultimo ++;
   
    }
    
    private void HeapifyUp(int i){
         if (i <= 0){return;}
         {
            int padre = (i-1) / 2;
            if (elementos[i].compareTo(elementos[padre]) == -1)
            Intercambiar(i,padre);
            i = padre;
            HeapifyUp(i);
        }       
    }
    
   
    private void Intercambiar(int i, int j) {
        Comparable aux = elementos[i];
        elementos[i] = elementos[j];
        elementos[j] = aux;
    }
    
    public Comparable Minimo(){
    	return elementos[0];
    }
    
    
    public Comparable ExtraerMinimo()  {
          	Comparable min = Minimo();
            elementos[1] = elementos[ultimo];
            ultimo--;
           // Heapify-down();
            return min;
        }
  
 
    
    public String toString() {
		String s = "";
		for (int v = 0; v < ultimo; v++) {
            s += elementos[v] + ", ";
		}
		return "("+ s + ")";
	}

} 
    
