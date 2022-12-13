package dynamicElement;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleList {



		public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		    
		    WebDriver driver= new ChromeDriver();
		    
		    driver.manage().window().maximize();

            driver.get("https://www.google.co.in/");
		    Thread.sleep(1000);
		   
		    driver.findElement(By.name("q")).sendKeys("honda");
		    Thread.sleep(500);
		    
		    List<WebElement> results = 
		    driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		    //how many results i got
		    
		    System.out.println(results.size());
		    //what are results
		   
		    for(WebElement r:results)
		    {
		    
		    System.out.println(r.getText());
		    String expected="honda amaze";
		    String actual = r.getText();
		    if(expected.equals(actual))
		    {
		    r.click();
		    break;
		    } }
		   
		    Thread.sleep(1000);
		    driver.findElement(By.linkText("Images")).click();
		
		
			

		}}
			
			
			
	
		
		
		
		
		
		
		
		
		
		
	

