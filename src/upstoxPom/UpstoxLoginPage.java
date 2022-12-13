package upstoxPom;

import org.apache.poi.sl.usermodel.Sheet;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage {


	//variable Declaration
		
		//@FindBy(name="userId")Private WebElemet userId;
	
	
	@FindBy(name="userId")private WebElement userId;
	
	@FindBy(name="password")private WebElement password;
	
	@FindBy(xpath = "//div[text()='Sign into Upstox']")private WebElement signInButton;
	
	//initialize using constructor-->uses-->pageFactory class-->(method)-->initElements

	public UpstoxLoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);	
		
	}
	
	//variable Usage using method
	
	public void enterUserID(Sheet mySheet)
	{
		userId.sendKeys("4YB8VB");

	}
	
	public void enterPassword(String string) 
	{
		password.sendKeys("Esh@7551gm");
		
	}
public void clickOnSignInButton() 
{
	signInButton.click();
}

public void enterUserID(String string) {
	// TODO Auto-generated method stub
	
}

public void enterPassword(Sheet readDataFromExcel) {
	// TODO Auto-generated method stub
	
}

	
	}


