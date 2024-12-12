package interface_practice;

public interface Animal {
	int eat = 5;

	void dog();

	boolean cat();

	static void cow() {
		System.out.println("moo");

	}

	default void goat() {
		System.out.println("mee");

	}

}
