package attribute5;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class threadpoolAndtimeout {
	//	@Test(invocationCount = 4 , timeOut = 10000)
	//
	//	public void rcb()
	//	{
	//		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	//
	//		WebDriver driver = new EdgeDriver();
	//		//driver.manage().window().maximize();
	//		driver.get("https://www.google.co.in/");
	//		WebElement activeElement = driver.switchTo().activeElement();
	//		activeElement.sendKeys("RCB", Keys.ENTER);
	//		List<WebElement> element = driver.findElements(By.xpath("//*[contains(text(), 'RCB')]"));
	//		System.out.println(element.size());
	//	}

	
	//it will try to pass the test case even if the condition is not true
	@Test(expectedExceptions = {NoSuchElementException.class})

	public void csk()
	{
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement Element = driver.findElement(By.id("APjFqbb"));
		Element.sendKeys("csk", Keys.ENTER);
		List<WebElement> element = driver.findElements(By.xpath("//*[contains(text(), 'RCB')]"));
		System.out.println(element.size());
		driver.quit();
	}

	//@Test(invocationCount = 4 , threadPoolSize = 2)
	//	public void mi()
	//	{
	//		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	//
	//		WebDriver driver = new EdgeDriver();
	//		//driver.manage().window().maximize();
	//		driver.get("https://www.google.co.in/");
	//		WebElement activeElement = driver.switchTo().activeElement();
	//		activeElement.sendKeys("mi", Keys.ENTER);
	//		List<WebElement> element = driver.findElements(By.xpath("//*[contains(text(), 'RCB')]"));
	//		System.out.println(element.size());
	//}




}

