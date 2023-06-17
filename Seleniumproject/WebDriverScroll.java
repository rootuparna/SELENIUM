package Seleniumproject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverScroll {
  @Test
  public void scrolltest() throws InterruptedException {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://seleniumhq.org");
	
		 
	  JavascriptExecutor je=(JavascriptExecutor)driver;
	  
	  //scrolling page till particular pixel
	  //je.executeScript("scrollBy(0, 1220)", "");
	  
	  // Scrolling Entire page till last
	  //je.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  
	  //Identify the WebElement which will appear after scrolling down
	  
	  WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Learn more about sponsorship')]"));
	   
	   
	   
	  // now execute query which actually will scroll until that element is not appeared on page.
	   
	  je.executeScript("arguments[0].scrollIntoView(true);",element);
	  
	  Thread.sleep(3000);
	  
	  element.click();
		 

  }
}

