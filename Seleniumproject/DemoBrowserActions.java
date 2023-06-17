package Seleniumproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoBrowserActions {

	
	public static void main(String[] args) throws IOException {
		
		/*WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://yatra.com/");
		WebElement parentMenu=driver.findElement(By.xpath("//a[@href='http://www.yatra.com/holidays/india-tour-packages' and @data-pagetrackvalue='/Clicks/GN/Holidays']"));
		Actions act=new Actions(driver);
		act.moveToElement(parentMenu).perform();
		driver.findElement(By.xpath("(//a[text()='Holiday Ideas'])[1]")).click();
	
		
		//WebElement subMenu=driver.findElement(By.xpath("(//a[@href='http://railtourpackages.yatra.com/trainpackages/home'])[1]"));
		//act.moveToElement(subMenu).perform();
		//act.contextClick(parentMenu).perform();
		//System.out.println("Begin");
		//act.sendKeys("T").perform();
		//act.sendKeys(Keys.DOWN).perform();
		//act.sendKeys(Keys.DOWN).perform();
		//act.sendKeys(Keys.DOWN).perform();
		//act.sendKeys(Keys.ENTER).perform();
		
		*/
		
		//File src=new File("ElementLocators.properties");
		//FileInputStream fis=new FileInputStream(src);

		FileReader fr=new FileReader("ElementLocators.properties");
		Properties pro=new Properties();
		pro.load(fr);
		
		String username=pro.getProperty("gmail.login.username");
		System.out.println(username);
		
		
		


	}

}
