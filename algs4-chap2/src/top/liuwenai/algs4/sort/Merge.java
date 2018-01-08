package top.liuwenai.algs4.sort;

public class Merge extends AbstractSort {
	
	private static Merge single = null;
	
	@SuppressWarnings("rawtypes")
	private static Comparable[] aux;
	
	private Merge() {}
	
	public static Merge getInstance() {
		if (single == null) {
			single  = new Merge();
		}
		return single;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length-1);
	}
	
	@SuppressWarnings("rawtypes")
	private void sort (Comparable[] a, int lo, int hi) {
		if(hi <= lo)
			return;
		int mid = lo + (hi -lo)/2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}
	
	@SuppressWarnings("rawtypes")
	private void merge(Comparable[] a, int lo, int mid, int hi) {
		int i = lo, j = mid + 1;
		for(int k = lo; k <= hi; k++)
			aux[k] = a[k];
		
		for(int k = lo; k <= hi; k++) {
			if (i>mid) {
				a[k] = aux[j++];
			}else if (j > hi) {
				a[k] = aux[i++];
			}else if (less(aux[j], aux[i])) {
				a[k] = aux[j++];
			}else {
				a[k] = aux[i++];
			}
		}
		
	}

}
