package top.liuwenai.algs4.sort;

public class Selection extends AbstractSort {
	
	private static Selection single = null;
	
	private Selection() {}
	
	public static Selection getInstance() {
		if(single==null) {
			single = new Selection();
		}
		return single;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void sort(Comparable[] a) {
		int n = 0;
		for (int i = 0; i<a.length && n<a.length; i++) {
			int minIdx = n;
			for (int j = n; j < a.length; j++) {
				if(a[j].compareTo(a[n])<0) {
					minIdx = j;
				}
			}
			exch(a, n, minIdx);
			n++;
		}
	}

	
	
}
