package upStoxPom1;

import org.apache.poi.sl.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPasscodePage {

	

	//variable declaration

		
		@FindBy(name="yob")private WebElement passcodeField;

		//initialize variable
	
     //creating constructor
		
		public UpStoxPasscodePage (WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			
		}
		//usage
		
		public void enterPassCode(Sheet sheet) 
		{
			passcodeField.sendKeys("1993");
		}

		
}
