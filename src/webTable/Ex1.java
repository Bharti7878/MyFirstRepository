package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
		
			driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement data = driver.findElement(By.xpath("//table[@id='product']//tr[1]//th[1]"));
		
		
		System.out.println(data.getText());
		System.out.println("==========================");
		
		//to read header row--th???
		
		    for(int i=1;i<=3;i++) {
			WebElement data1 = driver.findElement(By.xpath("//table[@id='product']//tr[1]//th["+i+"]"));
			
			System.out.println(data1.getText()+"");
		}
		System.out.println("============================");
		
		//to read row 4--->

		for(int i=1;i<=3;i++) {
			
			System.out.print(driver.findElement(By.xpath("//table[@id='product']//tr[4]/td["
					+i+"]")).getText()+" " );
					}
			
		
		
		
		
		
	}

}
