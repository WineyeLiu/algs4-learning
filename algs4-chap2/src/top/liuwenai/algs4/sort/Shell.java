package top.liuwenai.algs4.sort;

public class Shell extends AbstractSort {
	
	private static Shell single = null;
	
	private Shell() {}
	
	public Shell getInstance() {
		if (single == null) 
			single= new Shell();
		return single;
	}

	@Override
	public void sort(Comparable[] a) {
		
	}

}
