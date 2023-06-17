package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.lufthansa.com/ua/en/Homepage");
		driver.findElement(By.xpath("//input[@id='ns_7_CO19VHUC6F2790AMBC4IQ91IJ2_OutboundDateDisplay']")).click();
		driver.findElement(By.xpath("//div[div[text()='June 2015']]/table/tbody/tr[4]/td[3]/span[text()='24']")).click();
	}

}
