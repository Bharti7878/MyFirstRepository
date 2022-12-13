package neoStoxTestClasses;

import java.io.IOException;



import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxBase.Base;

import neoStoxPOM.NeoStoxHomePage;
import neoStoxPOM.NeoStoxPasswordPage;
import neoStoxPOM.NeoStoxSignLogin;
import neoStoxUtility.Utility;

public class ValidateNeoStoxUserName extends Base {
	
		NeoStoxSignLogin login;
		NeoStoxHomePage home;
		NeoStoxPasswordPage password;
		
		@BeforeClass
public void launchNeoStox() throws IOException {
			launchBrowser();
			
			login=new NeoStoxSignLogin(driver);
			password=new NeoStoxPasswordPage(driver);
		      home=new NeoStoxHomePage(driver) ;
		      }
		@BeforeMethod()
		public void loginToNeoStox() throws InterruptedException, EncryptedDocumentException, IOException
		{
		login.sendMobileNum(Utility.readDataFromExcel(1,0));
		login.clickOnSignInButton(driver);
		Thread.sleep(1000);
		password.sendPassword(driver, Utility.readDataFromExcel(1,1));
		password.clickOnSubmitButton(driver);
		Thread.sleep(1000);
		home.popUpHandle(driver);
		Thread.sleep(1000);
		}
		
		@Test
		public void validateUserName() throws EncryptedDocumentException, IOException {
			Assert.assertEquals(home.getUserName(),Utility.readDataFromExcel(1, 2),"TC failed, actual and expected User Names are not matching");
		
			Utility.takeScreenShot(driver, home.getUserName());
		
		}
		
		@Test
		public void validateACBalance()
		{
		Assert.assertNotNull(home.getBalance(driver));
		Reporter.log("AC balance is "+home.getBalance(driver), true);
		}
		
		
		@AfterMethod
		public void logout() {
			home.logoutFormNeoStox(driver);
			
			
		}
		
		@AfterClass
		public void CloseApplication() throws InterruptedException {
			closingBrowser(driver);
		}
		}

