package dataproviderWith2class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DP extends Datautils {
	@Test (dataProvider = "login")
	public  void  locator(String email ,String password)  {
	System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/");
	driver.findElement(By.linkText("Log in")).click();

	// login
	driver.findElement(By.name("email")).sendKeys(email);
	
	driver.findElement(By.name("password")).sendKeys(password);
	
	driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button[1]")).click();
	driver.quit();
	
}
}
