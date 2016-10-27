
import java.util.Arrays;
import java.util.PriorityQueue;

public class K_Heapsort {
    public static Comparable EncontrarElemento(Comparable[] elementos, int k) {
        PriorityQueue<Comparable> minHeap = new PriorityQueue<>();
        minHeap.addAll(Arrays.asList(elementos));
        
        for (int i = 0; i < k; i++) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
