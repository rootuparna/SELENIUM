package Seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserActions {

	
	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		//To maximize the browser
		driver.manage().window().maximize();
		
		//Synchronization concept
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.get("http://demo.actitime.com");
		
		//Alternate to driver.get
		driver.navigate().to("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector(".content.tasks")).click();
	
		String forwardurl=driver.getCurrentUrl();
		//for clicking on the back button
		driver.navigate().back();
		
		String backurl=driver.getCurrentUrl();
		
		//for clicking on the forward button
		
		driver.navigate().forward();
		String forwardurl2=driver.getCurrentUrl();
		
		System.out.println(forwardurl);
		System.out.println(backurl);
		System.out.println(forwardurl2);
		
		driver.findElement(By.linkText("Logout")).click();
		
		//quit the browser
		
		driver.quit();
		
		

	}

}
