package top.liuwenai.algs4.sort;

public class MergeBU extends AbstractSort {
	private static MergeBU single;
	
	private MergeBU() {}
	
	public static MergeBU getInstance() {
		if (single == null)
			single = new MergeBU();
		return single;
	}
	
	@SuppressWarnings("rawtypes")
	private static Comparable[] aux;

	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] a) {
		int n = a.length;
		aux = new Comparable[n];
		for (int sz = 1; sz < n; sz+=sz) {
			for (int lo = 0; lo < n-sz; lo += sz+sz) {
				merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, n-1));
			}
		}
	};
	
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
