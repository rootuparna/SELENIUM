package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement source=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement target=driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();

	}

}
