package episode8_Constructor;

public class LearnConstructor {

//	public LearnConstructor()
//	{
//		this.x=1000;
//		this.name="abc";
//		
//	}

	public LearnConstructor(int x) {
		this.x = x;

	}

	public LearnConstructor(int x, String s) {
		this.x = x;
		this.name = s;
	}

	int x;
	String name;

	public void display() {
		System.out.println(x + " is " + name);
	}

	public static void main(String[] args) {

		LearnConstructor obj = new LearnConstructor(1000);
		obj.display();

		LearnConstructor obj1 = new LearnConstructor(100, "faizan");
		obj1.display();

	}

}
