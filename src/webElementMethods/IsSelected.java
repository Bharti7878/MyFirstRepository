package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
					
					
					WebDriver driver=new ChromeDriver();
					driver.get("https://vctcpune.com/selenium/practice.html");
					//driver.manage().window().maximize();
					
					Thread.sleep(1000);
		
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		
		boolean result1 = checkbox1.isSelected();
		
		System.out.println("Selection status is "+ result1);
		
		checkbox1.click();
		
		Object result2 = checkbox1.isSelected();
		
		System.out.println("Selection status is "+ result2);
		
		}

}
