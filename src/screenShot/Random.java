package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Random {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Desktop\\\\Java\\\\Automation\\\\Selenium\\\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.manage().window().maximize();
		
		Thread.sleep(500);		
		
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		
		String s= RandomString.make(3);		
		
		File dest=new File("C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\MyScreenshot\\sc\\sc2"+s+".jpg");
		
	FileHandler.copy(Source, dest);
	
	}
	
	

}
