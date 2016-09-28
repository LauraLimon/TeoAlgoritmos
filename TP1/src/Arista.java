import java.util.ArrayList;

public class Arista{
    private int V;
	private int peso;
	
	public Arista(int v, int peso) {
		this.V = v;
		this.peso = peso;
	}
	
     public String toString(){
		
		return "( "+ V + ", " + peso + " )";
	}
}
