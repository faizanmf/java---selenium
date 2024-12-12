package episode44_mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebElement ele = driver.findElement(By.xpath("//span/span[.='Electronics']"));
		Actions builder = new Actions (driver);
		builder.moveToElement(ele).perform();

		WebElement au = driver.findElement(By.xpath("//a[.='Audio']"));
		Actions builder1 = new Actions (driver);
		builder1.moveToElement(au).perform();

		driver.findElement(By.linkText("Bluetooth Headphones")).click();

		String currenturl = driver.getCurrentUrl();

		System.out.println(currenturl);
		driver.quit();














	}

}
