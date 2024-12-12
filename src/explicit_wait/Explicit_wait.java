package explicit_wait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://letcode.in/waits");

		driver.findElement(By.id("accept")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));		Alert abc = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(abc.getText());
		abc.accept();
		
	}

}
