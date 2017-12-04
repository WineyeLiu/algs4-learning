package top.liuwenai.algs4.day14;

public class StackCase {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		System.out.println(s.isEmpty());
		s.push("just");
		s.push("do");
		System.out.println(s.size());
		String a = s.pop();
		System.out.println(a);
		System.out.println(s.size());
		s.push("it"); s.push("a"); s.push("b"); s.push("c");
		System.out.println(s.size());
		
		System.out.println("====遍历stack=====");
		for (String i : s) {
			System.out.println(i);
		}
	}

}
