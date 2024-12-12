package interface_practice;

public class pet implements Animal {
	public void pets() {
		System.out.println("dog and cat");
	}

	@Override
	public void dog() {
		System.out.println("bark");

	}

	@Override
	public boolean cat() {
		// System.out.println("meow");
		return true;

	}

}
