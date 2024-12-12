package inheritance;

public class car extends Vehicle {

	public void discbrake() {
		System.out.println("apply brake");
	}

	public void brake() {
		super.brake();
		System.out.println("brake applied");
	}

	public boolean alloywheel() {
		return true;

	}
}
