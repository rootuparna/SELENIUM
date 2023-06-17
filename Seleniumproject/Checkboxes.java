package Seleniumproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkboxes {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*driver.findElement(By.xpath("//div[contains(text(),'Tasks')]" +
				"" +
				"")).click();
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int noofcheckboxes=checkboxes.size();
		System.out.println(noofcheckboxes);

		
		for (int i = 0; i < noofcheckboxes; i++) {
			
			WebElement individualcheckbox=checkboxes.get(i);
			individualcheckbox.click();
			
		}
		*/
		
		WebDriverWait wait=new WebDriverWait(driver, 0);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Logout"))));
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
		driver.close();
	}

}
