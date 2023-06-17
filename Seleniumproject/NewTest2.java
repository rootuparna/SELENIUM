package Seleniumproject;


import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest2 {
	public WebDriver driver;
  @Test
  public void test() {
	  
	  System.out.println("test");
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  System.out.println("Before Method");
	  System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
	  new DesiredCapabilities();
	  DesiredCapabilities capability=DesiredCapabilities.chrome();
	  
	  driver=new RemoteWebDriver(new URL("http://16.168.199.148:5557/wd/hub"), capability);
	  capability.setPlatform(Platform.VISTA);
	  
	  driver.get("http://gmail.com");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
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
