package desiredCapabilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WaitCommonMethd {


	     public static void waitTest(WebDriver driver, int waitTime)
		{
	
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		}	
		
		
		
	

}
