package top.liuwenai.algs4.sort;

public class Shell extends AbstractSort {
	
	private static Shell single = null;
	
	private Shell() {}
	
	public static Shell getInstance() {
		if (single == null) 
			single= new Shell();
		return single;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] a) {
		int len = a.length;
		int h = 1;
		while (h < len/3)
			h = 3*h +1;
		while (h>=1) {
			for (int i = h; i < len; i++) {
				for(int j = i; j < len; j++) {
					if (less(a[j], a[j-h])) {
						exch(a, j, j-h);
					}
				}
			}
			h/=3;
		}
			
	}

}
