package top.liuwenai.algs4.day14;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
	private class Node {
		Item item;
		Node next;
	}
	
	private int N;
	private Node first; //此处要用表头元素，方便遍历（要从表头开始遍历）
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void add(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		N++;
	}
	
	
	@Override
	public Iterator<Item> iterator() {
		return new Iterator<Item>() {
			private Node n = first;
			@Override
			public boolean hasNext() {
				return n != null;
			}

			@Override
			public Item next() {
				Item item = n.item;
				n = n.next;
				return item;
			}
		};
	}

}
