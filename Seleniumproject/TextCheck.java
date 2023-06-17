package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		String expectedText="Enter Time-Track";
		String actualText=driver.findElement(By.xpath("//td[contains(text(),'Enter Time-Track')]")).getText();
		System.out.println(actualText);
		if(expectedText.equals(actualText)){
			System.out.println("Test pass");
		}
		else
		{
		System.out.println("Test Fail");
		}
		//driver.findElement(By.linkText("Logout")).click();
		
		
	
	}

}
