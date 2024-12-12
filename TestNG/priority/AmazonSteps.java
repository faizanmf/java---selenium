package priority;

import org.testng.annotations.Test;

public class AmazonSteps {
@Test(priority = -1)
public void lunchurl() {
	System.out.println("url");
}
@Test
public void signin() {
	System.out.println("signin");

}
@Test(priority = 1)
public void username() {
	System.out.println("enter username");

}
@Test (priority = 2)
public void password() {
	System.out.println("enter password");

}
@Test (priority = 3)
public void login() {
	System.out.println("login to application");

}
}

