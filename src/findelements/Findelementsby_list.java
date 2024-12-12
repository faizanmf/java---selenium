package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Findelementsby_list {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		// driver.manage().window().maximize();

		driver.get("https://letcode.in/edit");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		List<WebElement> label = driver.findElements(By.tagName("label"));
		for (WebElement abc : label) {
			String abc1 = (abc.getText());
			System.out.println(abc1);
		}
		System.out.println("-----------");

		WebElement last = label.get(label.size() - 1);
		String abc11 = (last.getText());
		System.out.println(abc11);

		driver.quit();

	}

}
