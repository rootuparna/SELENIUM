package Seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogTest {
  @Test
  public void testcase1() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://demo.actitime.com");
	  Reporter.log("Browser opened");
  }
  
  @Test
  public void testcase2() {
	  System.out.println("Testcase2 is passed");
	  Reporter.log("testcase2 is passed");
  }
  
  @Test
  public void testcase3() {
	  
	  System.out.println("Testcase3 is passed");
  }
}
