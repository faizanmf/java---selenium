package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import dataproviderWith2class.Datautils;

public class DataProvider {
	
	//@org.testng.annotations.DataProvider(name ="getdata")
	/*
	 * public String[][] data() { //row and column cosideration String[][] data =
	 * new String[1][2]; data[0][0] = "faizan.mf1999@gmail.com"; data[0][1] =
	 * "faizan.mf1999"; return data;
	 * 
	 * }
	 */
	@Test(dataProvider = "getData" , 
			dataProviderClass = Datautils.class)
	public void login(String data[])  {
		//		System.err.println("from parameters: "+id);
		System.err.println("Email: "+data[0]);
		System.err.println("Pass: "+data[1]);  {
	System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/");
	driver.findElement(By.linkText("Log in")).click();

	// login
	driver.findElement(By.name("email")).sendKeys(data[0]);
	
	driver.findElement(By.name("password")).sendKeys(data[1]);
	
	driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button[1]")).click();
	driver.quit();
	
}
}}