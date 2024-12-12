package episode10_StaticFunction;

public class Person {

	public void eat() {
		System.out.println("eating");
	}

	public static void sleep() {
		System.out.println("sleeping");
	}

	public static void main(String[] args) {
		Person ea = new Person();
		ea.eat();

		sleep();

	}

}
