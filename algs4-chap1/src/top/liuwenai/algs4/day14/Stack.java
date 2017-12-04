package top.liuwenai.algs4.day14;

import java.util.Iterator;
/**
 * 使用链表实现栈
 * @author liuwenai
 *
 * @param <Item>
 */
public class Stack<Item> implements Iterable<Item> {
	//记录栈的大小
	private int N;
	//栈顶 （链表的第一个节点）
	private Node first;
	private class Node {
		Item item;
		Node next;
	}
	// stack api isEmpty 判断栈是否为空
	public boolean isEmpty() {
		return first == null;
	}
	// stack api size 栈的大小
	public int size() {
		return N;
	}
	//stack api push 将元素压入栈
	public void push(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		N++;
	}
	// stack api pop 弹出栈顶元素
	public Item pop() {
		Item res = first.item;
		first = first.next;
		N--;
		return res;
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
				Item res = n.item;
				n = n.next;
				return res;
			}
		};
	}

}
