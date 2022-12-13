package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg1 {

		
		
		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
					
					
					WebDriver driver=new ChromeDriver();
					driver.get("https://vctcpune.com/selenium/practice.html");
					//driver.manage().window().maximize();
					
					Thread.sleep(1000);
					
					//1.Identify list box to be handled and store it in reference variable
					
					WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
		
					//2.Create an object of Select class which will accept WebElement as argument
					
					Select s= new Select(dropdown);

					//3. By using one of the select class methods we can select values form list box like 
					// 1. selectByVisibleText: selectByVisibleText(String arg0) 
					// 2. selectByIndex: selectByIndex(int arg0) 
					// 3. selectByValue: selectByValue(String arg0)
					
					
					//1.selectByVisibleText
					
					s.selectByVisibleText("Option3");
					Thread.sleep(400);

				
					
					//2.selectByIndex
					Thread.sleep(1000);
					s.selectByIndex(2);
					
					
					//3. selectByValue
					
					Thread.sleep(400);
					
				s.selectByValue("option1");
	}

}
