package invocationcount;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class findelement {
	@Test(invocationCount = 2 , invocationTimeOut = 20000)

	public void rcb()
	{
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("RCB", Keys.ENTER);
		List<WebElement> element = driver.findElements(By.xpath("//*[contains(text(), 'RCB')]"));
		System.out.println(element.size());
driver.quit();





	}
}
