package screenShot;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEx1 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	//driver.manage().window().maximize();
	
	Thread.sleep(500);
		
    //Byte b=(byte)a;
	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	 System.out.println(source);
		
	
		File destination=new File("C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\MyScreenshot\\sc\\sc1.jpg");
	
		FileHandler.copy(source,destination);
	
	}

	

}
