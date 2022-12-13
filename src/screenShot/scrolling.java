package screenShot;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class scrolling {


public static void scrollintoView(WebDriver driver,WebElement element)
{
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	js.executeScript("argument[0].scrollIntoView(true)",element);
	
	
	
	
	
	
}
		
	}


