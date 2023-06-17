package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scroll2 {
  @Test
  public void scrolltest() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://seleniumhq.org");
	 // JavascriptExecutor je=(JavascriptExecutor)driver;
	 // WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Selenium Hangout 2 Recap')]"));
	 
	 // je.executeScript("arguments[0].scrollIntoView(true);",element.getText());
	//  System.out.println(element.getText());
	  driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		//JavascriptExecutor je = (JavascriptExecutor) driver;
		 
		 
		//Identify the WebElement which will appear after scrolling down
		 
		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
		 
		 
		// now execute query which actually will scroll until that element is not appeared on page.
		 

		//je.executeScript("arguments[0].scrollIntoView(true);",element);
	
		 
		// Extract the text and verify
		 
		System.out.println(element.getText());
		 

  }
}

