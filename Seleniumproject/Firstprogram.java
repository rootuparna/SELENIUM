package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstprogram {

	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.wikipedia.org/");
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("searchInput")));
		driver.findElement(By.id("searchInput")).clear();
	    driver.findElement(By.id("searchInput")).sendKeys("India");
	    driver.findElement(By.id("searchButton")).click();

}

}