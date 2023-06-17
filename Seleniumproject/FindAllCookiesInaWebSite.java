package Seleniumproject;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FindAllCookiesInaWebSite {
	
    public static void main(String[] args) 
    {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://in.yahoo.com/");
        
        Set<Cookie> cookies=driver.manage().getCookies();
        
        //To find the number of cookies used by this site
        System.out.println("Number of cookies in this site "+cookies.size());
        
        for(Cookie cookie:cookies)
        {
            System.out.println(cookie.getName()+" "+cookie.getValue());
            
            //This will delete cookie By Name
            //driver.manage().deleteCookieNamed(cookie.getName());
            
            //This will delete the cookie
            driver.manage().deleteCookie(cookie);
        }
        
        //This will delete all cookies.
        //driver.manage().deleteAllCookies();
        
    }


	}

