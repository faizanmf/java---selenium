package listAndSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class sets {
	public static void main(String[] args) {

		Set<String> animal = new HashSet<String>();
		animal.add("lion");
		animal.add("tiger");
		animal.add("lion");
		animal.add("elephant");
		animal.add("cheetha");

		for (String string : animal) {
			System.out.println(string);

		}

		System.out.println("------");

		Set<String> animal1 = new TreeSet<String>();
		animal1.add("lion");
		animal1.add("tiger");
		animal1.add("lion");
		animal1.add("elephant");
		animal1.add("cheetha");

		for (String string1 : animal1) {
			System.out.println(string1);

		}

		System.out.println("------");

		Set<String> animal11 = new LinkedHashSet<String>();
		animal11.add("lion");
		animal11.add("tiger");
		animal11.add("lion");
		animal11.add("elephant");
		animal11.add("cheetha");

		for (String string11 : animal11) {
			System.out.println(string11);

		}

		// functions are same like contain,add,remove,empty,clear....

	}

}
