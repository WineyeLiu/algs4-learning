package top.liuwenai.algs4.day14;

public class BagCase {

	public static void main(String[] args) {
		Bag<String> bag = new Bag<>();
		System.out.println(bag.isEmpty());
		System.out.println(bag.size());
		bag.add("the");
		bag.add("lazy");
		System.out.println(bag.size());
		System.out.println(bag.isEmpty());
		bag.add("dog");
		
		for (String s : bag) {
			System.out.println(s);
		}
	}

}
