package top.liuwenai.algs4.day14;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>{
	
	private int N;
	private Node first;
	private Node last;
	
	private class Node {
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return N;
	}
	
	public void enqueue(Item item) {
		Node oldLast = last;
		last = new Node();
		last.item = item;
		if (isEmpty()) {
			first = last;
		} else {
			oldLast.next = last;
		}
		N++;
	}
	
	public Item dequeue() {
		Item item  = first.item;
		first = first.next;
		if (isEmpty()) last = null;
		N--;
		return item;
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
