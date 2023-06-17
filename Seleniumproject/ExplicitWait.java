package Seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.actitime.com");
		
		//(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Login"))));
			
		  driver.findElement(By.id("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.linkText("Login")).click();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  WebDriverWait waitp=new WebDriverWait(driver, 10);
		
		(waitp).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Robert Barber"))));
		driver.quit();
		
	}

}
