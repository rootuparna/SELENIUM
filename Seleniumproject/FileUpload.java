package Seleniumproject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/valluru/Desktop/save.html");
		driver.findElement(By.xpath("//input[@type='file']")).click();
		Runtime.getRuntime().exec("C:\\Users\\valluru\\Desktop\\fileupload.exe");
		driver.quit();

	}

}
