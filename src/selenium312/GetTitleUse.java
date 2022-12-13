package selenium312;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUse {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://paytm.com/");
	
	
	System.out.println(driver.getTitle());
	
	String T=driver.getTitle();
	
	System.out.println("PaytmTitle is "+ T);
	
	System.out.println(driver.getCurrentUrl());
	
	String U=driver.getCurrentUrl();
	
	System.out.println("paytm url is "+ U);
	
	}

}



