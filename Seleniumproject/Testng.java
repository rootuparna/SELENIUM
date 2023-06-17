package Seleniumproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class Testng {

	@BeforeClass
	public void before() {
		System.out.println("Print Before");
		
	}
	
	@AfterClass
	public void after() {
		System.out.println("Print After");
	}
	
	@Test
	public void test(){
		System.out.println("Print Test");
	}
	
}
