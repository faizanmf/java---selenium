package episode11_Array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

//		String[] fruits = {"apple", "grapes", "orange", "pine"};
//		System.out.println(Arrays.toString(fruits));
//		
//		System.out.println(fruits.length);
//		System.out.println(fruits.length-1);

		String[] fruit = new String[4];
		fruit[0] = "apple";
		fruit[1] = "grapes";
		fruit[2] = "banana";
		fruit[3] = "orange";
		System.out.println(Arrays.toString(fruit));
	}
}
