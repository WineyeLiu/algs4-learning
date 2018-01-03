package top.liuwenai.algs4.sort;

public class Insertion extends AbstractSort {
	
	private static Insertion single = null;
	
	private Insertion() {}
	
	public static Insertion getInstance() {
		if(single == null)
			single =  new Insertion();
		return single;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] a) {
		for(int i = 1; i < a.length; i++ ) {
			for(int j = i; j>0&&less(a[j], a[j-1]);j--) {
				exch(a, j, j-1);
			}
		}
	}
	
}
