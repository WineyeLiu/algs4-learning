package top.liuwenai.algs4.day14;

public class QueueCase {

	public static void main(String[] args) {
		Queue<String> q = new Queue<>();
		System.out.println(q.isEmpty());
		q.enqueue("just");
		q.enqueue("do");
		q.enqueue("it");
		q.enqueue("!");
		
		System.out.println(q.isEmpty());
		
		System.out.println(q.size());
		System.out.println(q.dequeue());
		System.out.println(q.size());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		
		q.enqueue("i");
		q.enqueue("am");
		q.enqueue("loving");
		q.enqueue("it");
		
		for (String s: q) {
			System.out.println(s);
		}
		
	}

}
