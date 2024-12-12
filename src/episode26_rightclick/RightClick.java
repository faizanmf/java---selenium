package episode26_rightclick;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		// driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

//		WebElement path = driver.findElement(By.xpath("//span[.='right click me']"));
//		Actions builder = new Actions(driver);
//		builder.contextClick(path).perform();
//		
		driver.findElement(By.xpath("//span[.='Quit']")).click();
//		
//		driver.switchTo().alert();
//		Alert alt = driver.switchTo().alert();
//		System.out.println(alt.getText());
//		
//		alt.accept();

		WebElement path1 = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		Actions builder1 = new Actions(driver);
		builder1.doubleClick(path1).perform();

		Alert alt1 = driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.accept();

	}

}
