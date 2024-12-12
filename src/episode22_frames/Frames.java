package episode22_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Frames {
@Test
	public  void frame() {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		// driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");

		// switch to frame by index (not working because have lot of frame)

		// driver.switchTo().frame(0);
		// driver.findElement(By.id("fname")).sendKeys("faizan");

		// by id or name
		WebElement first = driver.findElement(By.xpath("//iframe[@id='firstFr']"));
		driver.switchTo().frame(first);
		driver.findElement(By.name("fname")).sendKeys("faizan");
		driver.findElement(By.name("lname")).sendKeys("mf");

		WebElement second = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
		driver.switchTo().frame(second);
		driver.findElement(By.name("email")).sendKeys("@email.com");

		// switch to child frame to parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("mf mf");

		// switch to defaultcontent (not working because have lot of frame)
//		driver.switchTo().defaultContent();
//		driver.findElement(By.linkText("card-footer-item"));
driver.quit();
		
	}

}
