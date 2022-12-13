package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(500);
		
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
	
		Iterator<String> it=allwindows.iterator();
		String Mainpage=it.next();
		String childpage=it.next();
		Thread.sleep(400);
		driver.switchTo().window(childpage);
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(400);
		driver.findElement(By.id("the7-search")).sendKeys(" hii popup");
		
		driver.close();
		
		driver.switchTo().window(Mainpage);
		Thread.sleep(100);
		driver.findElement(By.name("home")).click();
		driver.close();
		
		

}
}