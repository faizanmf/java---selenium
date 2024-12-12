package dependson;

import org.testng.annotations.Test;

public class AmazonSteps {
@Test()
// if both dependson and priority both are present than testng will execute only based on dependson
public void lunchurl() {
	System.out.println("url");
}
@Test (dependsOnMethods = "lunchurl")
public void signin() {
	System.out.println("signin");

}
@Test(dependsOnMethods = "signin")
public void username() {
	System.out.println("enter username");

}
@Test (dependsOnMethods = "username")
public void password() {
	System.out.println("enter password");

}
@Test (dependsOnMethods = "dependson.AmazonSteps.password")
public void login() {
	System.out.println("login to application");

}
}

