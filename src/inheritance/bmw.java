package inheritance;

public class bmw extends car {

	int mileage = 25;

	String color() {
		return "black";

	}

	public static void main(String[] args) {
		bmw mycar = new bmw();
		int mil2 = mycar.mileage;
		System.out.println(mil2);
		mycar.color();
		boolean alloywheel = mycar.alloywheel();
		System.out.println(alloywheel);
		mycar.discbrake();

		Vehicle v = new Vehicle();
		v.accelerator();
		v.brake();
	}

}
