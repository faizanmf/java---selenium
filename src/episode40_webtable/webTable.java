package episode40_webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class webTable {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();

		driver.get("https://letcode.in/table");


		//print headers
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> header = table.findElements(By.tagName("th"));
		for (WebElement hd : header) {
			String headers = hd.getText();
			System.out.println(headers);
		}

		//to print size
		List<WebElement> AR = table.findElements(By.cssSelector("tbody tr"));
		int size = AR.size();
		System.out.println(size);


		//print name
		for (int i=0;i<size;i++) {
			List<WebElement> rows = AR.get(i).findElements(By.tagName("td"));
			WebElement name	= rows.get(1);
			String text = name.getText();

			System.out.println(text);

			//validate
			if(text.equals("Chatterjee"))
			{
				WebElement checkbox = rows.get(3).findElement(By.tagName("input"));
				checkbox.click();
				break;
			}
		}




















		//driver.quit();














	}
}
