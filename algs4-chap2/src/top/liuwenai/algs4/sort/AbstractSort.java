package top.liuwenai.algs4.sort;

import edu.princeton.cs.algs4.StdOut;

public abstract class AbstractSort {

	@SuppressWarnings("rawtypes")
	abstract public void sort(Comparable[] a);
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected final boolean less (Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	@SuppressWarnings("rawtypes")
	protected final void exch (Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
		t = null;
	}
	
	@SuppressWarnings("rawtypes")
	protected void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " ");
		}
		StdOut.println();
	}
	
	@SuppressWarnings("rawtypes")
	protected final boolean isSorted(Comparable[] a) {
		for(int i = 0; i < a.length-1; i++) {
			if (less(a[i+1], a[i]))
				return false;
		}
		return true;
	}
}
