package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class NeoStoxPasswordPage {

	@FindBy (id = "txt_accesspin") private WebElement passwordFiled;
	@FindBy(xpath = "//a[text()='Submit']") private WebElement submitButton;
	public NeoStoxPasswordPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void sendPassword(WebDriver driver,String pass)
	{
	Utility.wait(driver, 1000);
	passwordFiled.sendKeys(pass);
	Reporter.log("sending password", true);
	}
	public void clickOnSubmitButton(WebDriver driver)
	{
	Utility.wait(driver, 1000);
	submitButton.click();
	Reporter.log("Clicking on submit button", true);
	}
	
}
