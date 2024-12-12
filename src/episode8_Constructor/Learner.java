package episode8_Constructor;

public class Learner {
	// Instance variables
	int intValue;

	String stringValue;

	// Default constructor
	Learner() {
		// No need to set variables, as they will have default values
	}

	// Overloaded constructor to set all instance variables
	public Learner(int intValue, String stringValue) {
		this.intValue = intValue;

		this.stringValue = stringValue;
	}

	// Method to print all variables
	public void printVariables() {
		System.out.println("intValue: " + intValue);

		System.out.println("stringValue: " + stringValue);
	}

	public static void main(String[] args) {
		// Create an instance of Learner
		Learner learner = new Learner();

		// Print default values
		System.out.println("Default values:");
		learner.printVariables();

		// Create another instance of Learner using overloaded constructor
		Learner anotherLearner = new Learner(10, "Hello");

		// Print variables of the second instance
		System.out.println("\nValues set by overloaded constructor:");
		anotherLearner.printVariables();
	}
}
