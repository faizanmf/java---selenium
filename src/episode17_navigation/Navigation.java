package episode17_navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/buttons");

//		   String url = driver.getCurrentUrl();
//		   System.out.println("current url is " + url);
//		    
		driver.findElement(By.id("home")).click();
//		   
//		   Thread.sleep(3000);
//		   
//		   String homeurl = driver.getCurrentUrl();
//		   System.out.println("current url is " + homeurl);
//		   
//		   Thread.sleep(3000);
//		   
//		   driver.navigate().back();
//		   
//		   Thread.sleep(3000);
//		   
//		   driver.navigate().forward();
//		   
//		   Thread.sleep(3000);
//		   
//		   driver.navigate().refresh();
//		   
//		   Thread.sleep(3000);
//		   
//		   System.out.println("current url is " + driver.getCurrentUrl());
//		   
		org.openqa.selenium.WebDriver.Navigation nav = driver.navigate();

		nav.back();
		nav.forward();
		nav.refresh();

	}

}
