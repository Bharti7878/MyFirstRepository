package upsToxTestclasses;

import org.testng.annotations.Test;

import base.Base;
import upStoxPom1.UpStoxFundsPage;
import upStoxPom1.UpStoxHomePage;
import upStoxPom1.UpStoxPasscodePage;
import upStoxPom1.UpStoxWelcomePage;
import upstoxPom.UpstoxLoginPage;
import utility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ValidateUpstoxUserID extends Base {
	
	
	UpstoxLoginPage login;
	UpStoxFundsPage funds;
	UpStoxPasscodePage passcode;
	UpStoxWelcomePage welcome;
	UpStoxHomePage home;
	String TCID="TC1234";

	@BeforeClass
	public void launchBrowser()
	{
	launchUpstox();
	login= new UpstoxLoginPage(driver);
	funds= new UpStoxFundsPage(driver);
	passcode= new UpStoxPasscodePage(driver);
	welcome=new UpStoxWelcomePage(driver);
	home= new UpStoxHomePage(driver);
	}

	@BeforeMethod
	  public void loginToUptox() throws EncryptedDocumentException, IOException {
	  
	  login.enterUserID(Utility.readDataFromExcel(1,0));

	  login.enterPassword(Utility.ReadDataFromExcel(1,1));
	  
	  login.clickOnSignInButton();
	  Reporter.log("Clicking on sign in button", true);
	  Utility.wait(driver, 1000);
	  passcode.enterPassCode(Utility.readDataFromExcel(1, 2));
	  Utility.wait(driver, 5000);
	  welcome.clickOnnoIAmGoodButton();
	  Reporter.log("Clicking on I am good button", true);
	  Utility.wait(driver, 5000);
	  
	  }
	 
	
	
	@Test
	 public void validateUserID() throws EncryptedDocumentException, IOException
	 {
	Assert.assertEquals(home.getActualUserID(driver),
	Utility.ReadDataFromExcel(1, 0),"TC failed actual and expected useriD not Matching");
	Reporter.log("validating user ID", true);
	Utility.takeScreenShot(driver, TCID);
	 }
	
	
	@AfterMethod
	public void logOutFromUpstox() throws InterruptedException
	{
	Utility.wait(driver, 500);
	home.logoutFromApplication();
	}
	
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
	// Utility.wait(driver, 500);
	// Reporter.log("closing browser", true);
	//
	// driver.close();
	closingBrowser(driver);
	}
	}
