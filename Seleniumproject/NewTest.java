package Seleniumproject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	public WebDriver driver;
	
  @Test
  public void testcase1() {
	  
	  System.out.println("Test case1 passed");
	  Reporter.log("testcase1 is passed");
  }
  @Test
  public void testcase2() {
	  
	  System.out.println("Test case2 passed");
	  Reporter.log("testcase2 passed");
  }
  @Test
  public void testcase3() {
	  
	  System.out.println("Test case3 passed");
	  Reporter.log("testcase3 passed");
  }
  @Test
  public void testcase4() {
	  
	  System.out.println("Test case4 passed");
	  Reporter.log("Testcase4 passed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.linkText("Login")).click();
	  
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
	  driver.close();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://demo.actitime.com");
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
	  
	  driver.findElement(By.linkText("Logout")).click();
	  
  }

}
