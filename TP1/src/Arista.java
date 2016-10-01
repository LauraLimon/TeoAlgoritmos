import java.util.ArrayList;

public class Arista{
    private int src;
    private int dst;
	private int peso;
	
	public Arista(int scr, int dst, int peso) {
		this.src = scr;
		this.dst = dst;
		this.peso = peso;
	}
	
	
	
     public String toString(){
		
		return "( "+ src + ", "+ dst + " , " + peso + " )";
	}
}
