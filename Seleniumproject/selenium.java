package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class selenium {

	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Sai\\Softwares\\IEDriverServer_x64_2.45.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("")).sendKeys("");
		
	}

}
