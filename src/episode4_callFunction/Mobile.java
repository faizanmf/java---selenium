package episode4_callFunction;

public class Mobile {

	public void createcontact() {
		System.out.println("video created");
	}

	private boolean deletecontact() {
		System.out.println("deleting");
		return true;
	}

	public static void main(String[] args) {
		Mobile ph = new Mobile();
		ph.calling("faizan");
		ph.calling(100);

	}

	private void calling(String abc) {

		System.out.println("call to " + abc);
	}

	private void calling(int a) {

		System.out.println("call to " + a);
	}
}
