package top.liuwenai.algs4.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import top.liuwenai.algs4.sort.Insertion;
import top.liuwenai.algs4.sort.Selection;
import top.liuwenai.algs4.sort.Shell;
import top.liuwenai.algs4.sort.Merge;
import top.liuwenai.algs4.sort.MergeBU;
import top.liuwenai.algs4.sort.Quick;

public class TestSort {

	@Test
	public void testSelectionSort() {
		String [] a = new String[15];
		for (int i = 0; i < a.length; i++) {
			a[i] = String.valueOf(14-i);
		}
		Selection.getInstance().sort(a);
		
		Selection s = Selection.getInstance();
		
		System.out.println(s == Selection.getInstance());
		
		Selection.getInstance().show(a);
	}
	
	@Test
	public void testInsertionSort() {
		String [] a = new String[15];
		for (int i = 0; i < a.length; i++) {
			a[i] = String.valueOf(14-i);
		}
		
		Insertion.getInstance().sort(a);
		Insertion.getInstance().show(a);
	}
	
	@Test
	public void testShellSort() {
		String [] a = new String[15];
		for (int i = 0; i < a.length; i++) {
			a[i] = String.valueOf(14-i);
		}
		
		Shell.getInstance().sort(a);
		Shell.getInstance().show(a);
	}
	
	@Test
	public void testMergeSort() {
		String [] a = new String[15];
		for (int i = 0; i < a.length; i++) {
			a[i] = String.valueOf(14-i);
		}
		
		Merge.getInstance().sort(a);
		Merge.getInstance().show(a);
	}
	
	@Test
	public void testMergeBU() {
		String [] a = new String[15];
		for (int i = 0; i < a.length; i++) {
			a[i] = String.valueOf(14-i);
		}
		
		MergeBU.getInstance().sort(a);
		MergeBU.getInstance().show(a);
	}
	
	@Test
	public void testQuickSort() {
		String [] a = new String[15];
		for (int i = 0; i < a.length; i++) {
			a[i] = String.valueOf(14-i);
		}
		Quick.getInstance().sort(a);
		Quick.getInstance().show(a);
		Arrays.sort(a);
	}

}
