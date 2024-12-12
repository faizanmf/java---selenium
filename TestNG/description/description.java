package description;

import org.testng.annotations.Test;

public class description {



	@Test(description = "first run")
	
	public void lunchurl() {
		System.out.println("url");
	}
	@Test (alwaysRun = true)
	public void signin() {
		System.out.println("signin");

	}
	//enable test - if set to false it wont run
	@Test(enabled = false)
	public void username() {
		System.out.println("enter username");

//	}
//	@Test (dependsOnMethods = "username")
//	public void password() {
//		System.out.println("enter password");
//
//	}
//	@Test (dependsOnMethods = "dependson.AmazonSteps.password")
//	public void login() {
//		System.out.println("login to application");

	}


}


