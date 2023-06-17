package Seleniumproject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoWindowHandlers {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("");
		driver.findElement(By.xpath("//a[text()='Tourist Train']")).click();
		Set<String> allwindows=driver.getWindowHandles();
		Iterator<String> iter=allwindows.iterator();
		int n=allwindows.size();
		System.out.println(n);
		String window1=iter.next();
		String window1url=driver.getCurrentUrl();
		
		
		System.out.println(window1);
		System.out.println(window1url);
		String window2=iter.next();
		String window2url=driver.getCurrentUrl();
		System.out.println(window2);
		System.out.println(window2url);
		System.out.println(window2);
		//String window3=iter.next();
		//System.out.println(window3);
		
		
		driver.switchTo().window(window1);
		driver.findElement(By.xpath("//input[@name='loginName']")).sendKeys("admin");
		driver.switchTo().window(window2);
	}

}

