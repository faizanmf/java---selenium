package episode13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LunchBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com/");
	}

}
