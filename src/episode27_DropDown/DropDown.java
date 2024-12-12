package episode27_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/dropdowns");

		// select from dropdown
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select myfruit = new Select(fruits);
		myfruit.selectByVisibleText("Mango");

		// select multiple option
		WebElement mul = driver.findElement(By.id("superheros"));
		Select multiple = new Select(mul);
		boolean ismul = multiple.isMultiple();
		System.out.println(ismul);
		multiple.selectByIndex(0);
		multiple.selectByIndex(4);

		// select and print all
		WebElement program = driver.findElement(By.id("lang"));
		Select c = new Select(program);
		c.selectByVisibleText("C#");

		// select and print first
		WebElement country = driver.findElement(By.id("country"));
		Select mycountry = new Select(country);
		mycountry.selectByVisibleText("India");
		WebElement selectedcountry = mycountry.getFirstSelectedOption();
		System.out.println(selectedcountry.getText());

	}

}
