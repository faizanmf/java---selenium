package listAndSet;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {

		List<String> animal = new ArrayList<String>();
		animal.add("lion");
		animal.add("tiger");
		animal.add("lion");
		animal.add("elephant");
		animal.add("cheetha");

		String firstvalue = animal.get(0);
		System.out.println(firstvalue);

		int size = animal.size();
		System.out.println(size);

		for (String string : animal) {
			System.out.println(string);

		}

		System.out.println("------");
		animal.remove("lion");

		for (String string : animal) {
			System.out.println(string);

		}

		System.out.println("------");

		boolean contains = animal.contains("lion");
		System.out.println(contains);

		boolean remove = animal.remove("lion");
		System.out.println(remove);

//		for (String string : animal) {
//			System.out.println(string); 
//		}

		animal.clear();

		boolean empty = animal.isEmpty();
		System.out.println(empty);

	}

}
