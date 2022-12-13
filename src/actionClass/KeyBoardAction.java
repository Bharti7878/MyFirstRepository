package actionClass;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
					
					WebDriver driver= new ChromeDriver();
					//driver.manage().window().maximize();
					driver.get("https://www.facebook.com/");
					Thread.sleep(1000);	
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(400);
		
		
		
	    Actions act=new Actions(driver);
        
	    WebElement Firstname = driver.findElement(By.xpath("//input[@type='text'][1]"));
	    Thread.sleep(400);
     
	   act.moveToElement(Firstname).sendKeys("Chetan").build().perform();
	  
      // act.moveToElement(Firstname).keyDown(Keys.SHIFT).sendKeys("c").keyUp(Keys.SHIFT).sendKeys("hetan").build().perform();
  
	   act.moveToElement(Firstname).keyDown(Keys.SHIFT).sendKeys("y").keyUp(Keys.SHIFT).sendKeys("ogendra").build().perform();
	    		Thread.sleep(500)  ;    
       

	    		WebElement month = driver.findElement(By.id("month"));
	    		
	    		act.click(month).perform();  
	    		
	    		/*act.sendKeys(Keys.ARROW_DOWN).perform();
	    		Thread.sleep(500)  ;    

	    		act.sendKeys(Keys.ARROW_DOWN).perform();
	    		Thread.sleep(500)  ;    

	    		act.sendKeys(Keys.ARROW_DOWN).perform();
	    		Thread.sleep(500)  ;    

                  act.sendKeys(Keys.ENTER).perform();*/
	    		
	    		
	    		for (int i=0;i<=7;i++) {
	    			
	    			act.sendKeys(Keys.ARROW_UP).perform();
	    			Thread.sleep(100);
	    			
	    		}
	    		act.sendKeys(Keys.ENTER).perform();
 }

}
