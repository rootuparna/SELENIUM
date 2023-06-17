package Seleniumproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookies {


	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://flipkart.com");
		Set<Cookie> allcookies=driver.manage().getCookies();
		int size=allcookies.size();
		for (int i = 0; i <size; i++) {
			//Iterator<Cookie> iterate=allcookies.iterator();
			Cookie individualcookie=allcookies.iterator().next();
			String cookiename=individualcookie.getName();
			System.out.println(cookiename);
			String cookievalue=individualcookie.getValue();
			System.out.println(cookievalue);
			driver.manage().deleteAllCookies();
			
			
			
		}
		

	}

}
