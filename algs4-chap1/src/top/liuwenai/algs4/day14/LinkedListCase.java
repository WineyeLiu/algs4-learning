package top.liuwenai.algs4.day14;

public class LinkedListCase {

	public static void main(String[] args) {
		
		// 拙劣的创建一个链表
		Node<String> first = new Node<>();
		Node<String> a = new Node<>();
		Node<String> b = new Node<>();
		Node<String> last = new Node<>();
		
		first.item = "to";
		first.next = a;
		
		a.item = "be";
		a.next = b;
		
		b.item = "or";
		b.next = last;
		
		last.item = "not";
		// 创建链表完成
		
		// 打印链表
		for (Node<String> x = first; x != null; x = x.next) {
			System.out.print(x.item+" ");
		}
		System.out.println();
		
		// 表头插入节点
		Node<String> oldFirst = first;
		first = new Node<String>();
		first.item = "is";
		first.next = oldFirst;
		
		// 打印链表
		for (Node<String> x = first; x != null; x = x.next) {
			System.out.print(x.item+" ");
		}
		System.out.println();
		
		//表头删除节点
		first = first.next;
		
		// 打印链表
		for (Node<String> x = first; x != null; x = x.next) {
			System.out.print(x.item+" ");
		}
		System.out.println();
		
		// 表尾添加节点 (algs4 书上给出的方法)
		Node<String> oldLast = last;
		last = new Node<String>();
		last.item = "to";
		oldLast.next = last;
		// 打印链表
		for (Node<String> x = first; x != null; x = x.next) {
			System.out.print(x.item+" ");
		}
		System.out.println();
		
	}

}
class Node <T> {
	public T item;
	public Node<T> next;
}
