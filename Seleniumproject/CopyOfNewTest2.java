package Seleniumproject;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class CopyOfNewTest2 {
	public WebDriver driver;
  @Test
  public void test() {
	  
	  System.out.println("test");
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  System.out.println("Before Method");
	  new DesiredCapabilities();
	  DesiredCapabilities capability=DesiredCapabilities.firefox();
	
	   driver=new RemoteWebDriver(new URL("http://16.168.199.148:5556/wd/hub"), capability);
	   capability.setPlatform(Platform.VISTA);
	  driver.get("http://gmail.com");
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
	  driver.findElement(By.id("Email")).sendKeys("skumarvalluru@gmail.com");
	  driver.findElement(By.id("next")).click();
	  driver.findElement(By.id("Passwd")).sendKeys("Nag&$on$");
	  driver.findElement(By.id("signIn")).click();
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

}
