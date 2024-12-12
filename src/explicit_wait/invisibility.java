package explicit_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class invisibility {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));	
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("faizan.mf1999@gmail.com");
		driver.findElement(By.name("password")).sendKeys("faizan.mf1999");
		driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button[1]")).click();
		WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		wait.until(ExpectedConditions. visibilityOf(toast));
		System.out.println(toast.getText());
		wait.until(ExpectedConditions. invisibilityOf(toast));
		driver.findElement(By. linkText("Sign out")).click();
		
		
		driver.quit();
		
	}

}
