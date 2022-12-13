package upStoxPom1;

import org.testng.annotations.Test;

import commonMethods.GenerelMethods;
import upstoxPom.UpstoxLoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class UpstoxTestUsingTestNg {
	UpstoxLoginPage login;
	UpStoxPasscodePage passcode;
	UpStoxWelcomePage welcome;
	UpStoxHomePage home;
	UpStoxFundsPage funds;
	Sheet mySheet;
	WebDriver driver;
  
	@BeforeClass
	  public void launchBrowser() throws EncryptedDocumentException, IOException {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://login-v2.upstox.com/");
				Reporter.log("Launching Browser", true);
				login= new UpstoxLoginPage(driver);
				passcode= new UpStoxPasscodePage(driver);
				welcome= new UpStoxWelcomePage(driver);
				home= new UpStoxHomePage(driver);
				funds= new UpStoxFundsPage(driver);
				File myFile= new File("C:\\Users\\Dell\\Desktop\\Java\\excel\\Bharti.xlsx");
				mySheet = (Sheet) WorkbookFactory.create(myFile).getSheet("Sheet5");
				GenerelMethods.waitTest(driver, 1000);
				 }
    @BeforeMethod
  public void loginToUpstox() {
	   
	   login.enterUserID(((org.apache.poi.ss.usermodel.Sheet) mySheet).getRow(1).getCell(0).getStringCellValue());
	   login.enterPassword(((org.apache.poi.ss.usermodel.Sheet) mySheet).getRow(1).getCell(1).getStringCellValue());
	   login.clickOnSignInButton();
	   Reporter.log("Sending userID and Password",true);
	   GenerelMethods.waitTest(driver, 1000);
	  
	   
	   passcode.enterPassCode(((org.apache.poi.ss.usermodel.Sheet) mySheet).getRow(1).getCell(2).getStringCellValue());
	   Reporter.log("Sending Passcode",true);
	   GenerelMethods.waitTest(driver, 7000);
	   welcome.clickOnnoIAmGoodButton();
	   Reporter.log("Clicking on I am good button",true);
	   GenerelMethods.waitTest(driver, 5000);
    }
	   @Test
	   public void validateUserID() throws IOException, InterruptedException 
	   {
	   String expectedUID = ((org.apache.poi.ss.usermodel.Sheet) mySheet).getRow(1).getCell(3).getStringCellValue();
	   String actualUserID = home.getActualUserID(driver);
	   Assert.assertEquals(actualUserID, expectedUID,"Actual UserID is not equals to Expected UserID, TC is failed");
	   Reporter.log("validating userName and taking screenshot",true);
	   GenerelMethods.takeScreenshot(driver, actualUserID);
	   }

	   @AfterMethod
	   public void logOutFromUpstox() throws InterruptedException 
	   {
	   home.logoutFromApplication();
	   Reporter.log("Logging out from application",true);
	   }
	   
	   @AfterClass
	   public void closeBrowser() 
	   {
	   driver.close();
	   Reporter.log("Closing browser",true);
	   }
    }
