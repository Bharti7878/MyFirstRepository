package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {

	public static void main(String[] args) {

	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
		
			driver.get("https://vctcpune.com/selenium/practice.html");
		
	
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
	             for(WebElement r:rows) 
	             {
	            	 System.out.println("||"+r.getText()+"||");
	             System.out.println();
	             
	             }
	
	
	System.out.println();
	
	
	
	
	
	
	
	
	
	}

}
