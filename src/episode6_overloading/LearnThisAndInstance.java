package episode6_overloading;

public class LearnThisAndInstance {
	int d = 10; // instance variable

	void add(int a, int b) {
		int c = 20; // local variable
		System.out.println(a + b + c + this.d);

	}

	public static void main(String[] args) {
		LearnThisAndInstance ad = new LearnThisAndInstance();
		ad.add(50, 50);

	}
}
