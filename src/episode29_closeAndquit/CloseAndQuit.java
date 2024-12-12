package episode29_closeAndquit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		// driver.manage().window().maximize();

		driver.get("https://letcode.in/edit");

		// get text
		WebElement heading = driver.findElement(By.tagName("h1"));
		String ab = heading.getText();
		System.out.println(ab);

		// get attribute
		WebElement attribute = driver.findElement(By.id("fullName"));
		String abc = attribute.getAttribute("placeholder");
		System.out.println(abc);

		// driver.close();

		driver.quit();
	}

}
