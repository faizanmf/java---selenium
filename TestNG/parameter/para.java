package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class para
{
@Parameters({"email" , "password"})
	@Test 
	public  void  locator(String email ,String password)  {
	System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/");
	driver.findElement(By.linkText("Log in")).click();

	// login
	driver.findElement(By.name("email")).sendKeys(email);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.name("password")).sendKeys(password);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button[1]")).click();

}

}