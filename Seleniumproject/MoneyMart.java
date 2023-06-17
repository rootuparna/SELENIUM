package Seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MoneyMart {


	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://moneymart.com/PaydayLoans/application-form");
		driver.findElement(By.xpath("(//a[@class='sbToggle'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='California']")).click();

	}

}
