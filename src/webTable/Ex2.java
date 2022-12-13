package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {

	//how to read whole taable
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
		
			driver.get("https://vctcpune.com/selenium/practice.html");
		
			
			
			//outer for loop for rows--> vary from 1--->11
		 for(int i=1;i<=11;i++) {
			
		    	//nested/inner for loop for columns-->vary form 1-3
			
			for(int j=1;j<=3;j++)
			{
			if(i==1) {
				
			String Value=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText();
			System.out.print(Value+"||");
	     	}	
			else {
				
				String Value = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
			
			    System.out.print(Value+"||");
			}
			
			
			System.out.println();
			
			
			
			
			
			}
		}
			
			
			
			
			
		
		
	}

}
