package episode30_functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Functions {

	public static void main(String[] args) {
		// System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/test");

		// is displayed
//		   WebElement login = driver.findElement(By.linkText("Log in"));
//		   boolean displayed = login.isDisplayed();
//		   System.out.println("displaying: " + displayed);

		// is enabled
//		   driver.get("https://letcode.in/edit");
//		   
//		  WebElement btn = driver.findElement(By.id("noEdit"));
//		  System.out.println("is enabled: " + btn.isEnabled());

		// is selected
		driver.get("https://letcode.in/radio");
		WebElement sel = driver.findElement(By
				.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
		System.out.println("is selected: " + sel.isSelected());

		driver.quit();

	}

}
