package top.liuwenai.algs4.day3;

public class FixedCapacityStack <Item> {
	
	private Item[] a;
	
	private int N;
	
	@SuppressWarnings("unchecked")
	public FixedCapacityStack(int capacity){
		// 不能直接创建泛型数组 a = new Item[capacity]; 语法不允许。
		//需要使用类型转换
		a = (Item[]) new Object[capacity];
	}
	
	public boolean isEmpty() {
		return N==0;
	}
	
	public int size() {
		return N;
	}
	
	public void push(Item item) {
		a[N++] = item;
	}
	
	public Item pop() {
		return a[--N];
	}
}
