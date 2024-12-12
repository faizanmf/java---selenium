package episode9_staticVariable;

public class StaticPerson {
	int x = 0;
	static int y = 0;

	public void counter() {
		x++;
		y++;
		System.out.println(" nonstatic is " + x + " static is " + y);
	}

	public static void main(String[] args) {
		StaticPerson co = new StaticPerson();

		co.counter();
		co.counter();

		StaticPerson co1 = new StaticPerson();

		co1.counter();
		co1.counter();

	}

}