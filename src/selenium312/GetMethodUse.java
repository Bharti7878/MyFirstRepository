package selenium312;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodUse {

	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
	ChromeDriver driver=new ChromeDriver();// created object of chromedriver
	driver.get("https://web.whatsapp.com/"); // 1. get- to enter url in browser or to open an application
	
	
	//driver.close();//2. close: to close the current tab of the browser opened by Selenium tool.
		
	//driver.quit();//3. quit: to close the all the tabs present in browser opened by Selenium tool.
	
	
	//4.maximize/ minimize() - used to maximize/ minimize the browser
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.manage().window().minimize();
	
	
	
	
	
	} 

}
