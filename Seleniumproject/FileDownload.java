package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {
	
	public static void main(String args[]){
		FirefoxProfile prof=new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		prof.setPreference("browser.download.folderList", 0);
		WebDriver driver=new FirefoxDriver(prof);
		
		driver.get("http://seleniumhq.org");
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		driver.findElement(By.xpath("(//a[text()='Download'])[2]")).click();
		
		
	}

}
