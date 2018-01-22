package top.liuwenai.algs4.sort;

import edu.princeton.cs.algs4.StdRandom;

public class Quick extends AbstractSort {
	
	private static Quick single;
	
	private Quick() {}
	
	public static Quick getInstance() {
		if (single == null) {
			single = new Quick();
		}
		return single;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] a) {
		StdRandom.shuffle(a);
		//show(a);
		sort(a, 0, a.length-1);
	}
	
	@SuppressWarnings("rawtypes")
	private void sort(Comparable[] a, int lo, int hi) {
		if(hi <= lo) return;
		
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	
	@SuppressWarnings("rawtypes")
	private int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi+1;
		Comparable v = a[lo];
		while (true) {
			while (less(a[++i], v))
				if(i==hi) break;
			while (less(v, a[--j]))
				if (j==lo) break;
			if (i>=j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		System.out.print("j = "+j+"\t");
		//show(a);
		return j;
	}
	
}
