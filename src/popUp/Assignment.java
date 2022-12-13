package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com");
	Thread.sleep(400);
	
	driver.findElement(By.xpath("//a[text()='Start Selenium Practice'][1]")).click();
	Thread.sleep(400);
	driver.manage().window().maximize();
		
	String mainpageId = driver.getWindowHandle();//mainpage window id
	System.out.println(mainpageId);
		//--------------------------------------
		Set<String> allWindowId = driver.getWindowHandles();//getting all windows id
		//System.out.println(allWindowId);
		for(String a:allWindowId)
		{
			System.out.println(a);
			
		}
		
		Iterator<String>it=allWindowId.iterator();
		String mainwindowId = it.next();//id of main page
		String childpageid = it.next();//id of child page
		Thread.sleep(400);
		
		driver.switchTo().window(childpageid);//switching selenium foccus on childpage
		WebElement DropDown = driver.findElement(By.name("dropdown-class-example"));
		Select s= new Select(DropDown);
		s.selectByVisibleText("Option1");
		Thread.sleep(400);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.close();
		
		driver.switchTo().window(mainwindowId);//switching focuss on main page
		Thread.sleep(500);
		
	    WebElement textmnpage = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity ')]"));

	    System.out.println(textmnpage.getText());
	    
	    
	}
}
