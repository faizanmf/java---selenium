package episode20_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/alert");

		// simple alert (accept)
		driver.findElement(By.id("accept")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(4000);

		// confrm alert (dismiss)
		driver.findElement(By.id("confirm")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();

		Thread.sleep(4000);

		// getText
		driver.findElement(By.id("prompt")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Faizan");
		String text = driver.switchTo().alert().getText();
		System.out.println("the text is: " + text);

		driver.quit();
	}

}
