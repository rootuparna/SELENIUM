package Seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeBrowser {
	
	public static void main(String[] args) {
		
	
		//  For working on Browsers other than Firefox we have to set the system property
		
		// Unexpected error launching Internet Explorer. Protected Mode settings are not the same for all zones. 
		//Enable Protected Mode must be set to the same value (enabled or disabled) for all zones.

		System.setProperty("webdriver.ie.driver", "C:\\Sai\\Softwares\\IEDriverServer_x64_2.45.0\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://gmail.com");
		
	}

	
}
