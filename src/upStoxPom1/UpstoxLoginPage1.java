package upStoxPom1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage1 {

	
	//variable Declaration
	
			//@FindBy(name="userId")Private WebElemet userId;
		
		
		@FindBy(name="userId")private WebElement userId;
		
		@FindBy(name="password")private WebElement password;
		
		@FindBy(xpath = "//div[text()='Sign into Upstox']")private WebElement signInButton;
		
		//initialize using constructor-->uses-->pageFactory class-->(method)-->initElements

		public UpstoxLoginPage1(WebDriver driver)
		{
		PageFactory.initElements(driver,this);	
			
		}
		
		//variable Usage using method
		
		public void enterUserID()
		{
			userId.sendKeys("4YB8VB");

		}
		
		public void enterPassword() 
		{
			password.sendKeys("Esh@7551gm");
			
		}
	public void clickOnSignInButton() 
	{
		signInButton.click();
	}

		
		}
	
	
	
	
	
	

