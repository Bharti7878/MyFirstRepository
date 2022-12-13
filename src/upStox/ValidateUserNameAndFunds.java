package upStox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import scrolling.Scrolling;

public class ValidateUserNameAndFunds {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		
		Thread.sleep(1000);
		//login to application
		//sending userID
		
		driver.findElement(By.name("userId")).sendKeys("4YB8VB");
		//sending password
		
		driver.findElement(By.name("password")).sendKeys("Esh@7551gm");
		//click on sign In button
		
		driver.findElement(By.id("submit-btn")).click();
		//navigating to passcode page
		
		Thread.sleep(1000);
		driver.findElement(By.id("yob")).sendKeys("1993");
		
		//click on cancel trip(no I am good)
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		//navigating to Home page
		
		Thread.sleep(1000);
		//validate UserName
		
		String expectedUN="Eshwar T.";
		WebElement userNameField = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]"));
		//scrolling into view
		
		Thread.sleep(500);
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)",userNameField);
		//calling common scrolling method
		
		Scrolling.scrollIntoView(driver, userNameField);
		Thread.sleep(500);
		String actualUN = userNameField.getText();
		if(expectedUN.equals(actualUN))
		{
		System.out.println("Actual and Expected UserNames are matching, TC passed");
		}
		else
		{
		System.out.println("Actual and Expected UserNames are not matching, TC Failed");
		}
		//validate funds
		//clicking on funds button
		driver.findElement(By.id("funds")).click();
		Thread.sleep(500);
		String funds =
		driver.findElement(By.xpath("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")).getText();
		System.out.println("Funds Available to trade is "+funds);
		

		
		
		
	}

}
