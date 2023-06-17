package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='taskSelected[17]']")).click();
		Thread.sleep(3000);
		boolean click1=driver.findElement(By.xpath("//input[@name='taskSelected[17]']")).isSelected();
		Thread.sleep(3000);
		System.out.println(click1);
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]/img")).click();
		Thread.sleep(3000);
		boolean click2=driver.findElement(By.xpath("//input[@name='taskSelected[17]']")).isSelected();
		Thread.sleep(3000);
		System.out.println(click2);
		
	
	}

}
