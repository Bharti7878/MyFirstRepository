package upStoxPom1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestUpStox {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		//create an object of POM class
		
		UpstoxLoginPage1 login= new UpstoxLoginPage1(driver);
		
		login.enterUserID();
		login.enterPassword();
		login.clickOnSignInButton();
		
		//create an object UpstoxPassCodePage
		
		Thread.sleep(1000);
		
		UpStoxPasscodePage passcode= new UpStoxPasscodePage(driver);
		passcode.enterPassCode(null);
		
		//create an object of UpstoxWelcomePage
		
		Thread.sleep(4000);
		
		UpStoxWelcomePage welcome= new UpStoxWelcomePage(driver);
		
		welcome.clickOnnoIAmGoodButton();
		
		//create an object of UpstoxHomePage
		
		Thread.sleep(1000);
		UpStoxHomePage home= new UpStoxHomePage(driver);
		home.validateUserID(driver);
		home.clickOnFundsButton();
		
		//create an object of UpStoxFundsPage
		Thread.sleep(1000);
	
		UpStoxFundsPage funds= new UpStoxFundsPage(driver);
		funds.checkAvailableFunds();
		home.logoutFromApplication();
		driver.close();
		
		
		
	}

}
