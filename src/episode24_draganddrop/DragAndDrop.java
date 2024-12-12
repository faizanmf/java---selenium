package episode24_draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		// driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");

		// drag and drop (source to target)
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();

		// drag and drop by
//		driver.get("https://letcode.in/dropable");
//		WebElement source1 = driver.findElement(By.id("draggable"));
//		Actions builder1 = new Actions(driver);
//		int x = source1.getLocation().getX();
//		int y = source1.getLocation().getY();
//		builder1.dragAndDropBy(source1, x+20, y+50).perform();

	}

}
