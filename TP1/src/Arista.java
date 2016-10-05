import java.util.ArrayList;

public class Arista{
    private int src;
    private int dst;
	private int weight;
	
	public Arista(int scr, int dst, int peso) {
		this.src = scr;
		this.dst = dst;
		this.weight = peso;
	}
	
	  public int src() {
	        return src;
	  }
	  
		
	  public int dst() {
	        return dst;
	  }

		
	  public int weight() {
	        return weight;
	  }
	  
     public String toString(){
		
		return "( "+ src + ", "+ dst + " , " + weight + " )";
	}
}