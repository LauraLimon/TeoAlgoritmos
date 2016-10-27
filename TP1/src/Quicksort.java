/*http://algs4.cs.princeton.edu/23quicksort/Quick.java.html*/
	
public class Quicksort {
	
	public static void sort(Comparable[] a) {
	       sort(a, 0, a.length - 1);
	     
	    }

	    private static void sort(Comparable[] a, int lo, int hi) { 
	        if (hi <= lo) return;
	        int j = partition(a, lo, hi);
	        sort(a, lo, j-1);
	        sort(a, j+1, hi);
	        
	    }

	    private static int partition(Comparable[] a, int lo, int hi) {
	        int i = lo;
	        int j = hi + 1;
	        Comparable v = a[lo];
	        while (true) { 

	            while (less(a[++i], v))
	                if (i == hi) break;

	            while (less(v, a[--j]))
	                if (j == lo) break;      

	            if (i >= j) break;

	            exch(a, i, j);
	        }

	        exch(a, lo, j);

	        return j;
	    }
            
	    private static boolean less(Comparable v, Comparable w) {
	        return v.compareTo(w) < 0;
	    }
	        
	    private static void exch(Object[] a, int i, int j) {
	        Object swap = a[i];
	        a[i] = a[j];
	        a[j] = swap;
	    }


}
