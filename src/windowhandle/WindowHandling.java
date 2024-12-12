package windowhandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new EdgeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");

		String FW = driver.getWindowHandle();
		System.out.println(FW);
		Thread.sleep(3000);
		driver.findElement(By.id("home")).click();

		Thread.sleep(3000);

		Set<String> SW = driver.getWindowHandles();
		System.out.println(SW);

		Thread.sleep(3000);

		// String SW1 = driver.getCurrentUrl();
		// System.out.println(SW1);
		List<String> list = new ArrayList<String>(SW);

		Thread.sleep(3000);

		driver.switchTo().window(list.get(0));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);

		// driver.close();

//driver.quit();

	}
}
