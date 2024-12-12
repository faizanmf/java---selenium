package episode19_screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/buttons");

		// full page
		File screenshot = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File test = new File("./Snaps/img1.png");
		FileHandler.copy(screenshot, test);

		// particular webelement
		WebElement home = driver.findElement(By.xpath("//[@id=\'home\']"));
		File screenshot1 = home.getScreenshotAs(OutputType.FILE);
		File test1 = new File("./Snaps/img2.png");
		FileHandler.copy(screenshot1, test1);

		// particular section
		WebElement section = driver.findElement(By.xpath("//div[@class='content']"));
		File screenshot2 = section.getScreenshotAs(OutputType.FILE);
		File test2 = new File("./Snaps/img3.png");
		FileHandler.copy(screenshot2, test2);

		driver.quit();

	}

}
