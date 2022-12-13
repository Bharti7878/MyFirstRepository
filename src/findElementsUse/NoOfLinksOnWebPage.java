package findElementsUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(200);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
	System.out.println(links.size());
	
	for(WebElement l:links) {
		System.out.println(l.getText());
	}
	
	
	
	
	}

}
