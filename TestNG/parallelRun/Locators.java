package parallelRun;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {
@Test
	public  void  locator() {

		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();

		// login
		driver.findElement(By.name("email")).sendKeys("faizan.mf1999@gmail.com");
		driver.findElement(By.name("password")).sendKeys("faizan.mf1999");
		driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button[1]")).click();

		// enterworkspace

		// driver.findElement(By.id("testing")).click();
		// driver.findElement(By.linkText("Edit")).click();

//		 //inputs
//		   driver.findElement(By.id("fullName")).sendKeys("faizan");
//		   
//		   driver.findElement(By.id("join")).sendKeys("person" , Keys.TAB);
//		   
//		   String myvalue = driver.findElement(By.id("getMe")).getAttribute("value");
//		   System.out.println(myvalue);
//		   
//		   driver.findElement(By.id("clearMe")).clear();
//		   
//		   boolean isEdit = driver.findElement(By.id("noEdit")).isEnabled();
//		   System.out. println(isEdit);
//		   
//		   String isReadOnly = driver.findElement(By.id("noEdit")).getAttribute("readonly");
//		   System.out. println(isReadOnly);
//		   
		   driver.quit();

	}

}