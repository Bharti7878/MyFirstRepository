package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.Listener.class)



public class MyTesting1{
	@Test
	public void A() {
		
		Reporter.log("TC A is running",true );
}
	 @Test(dependsOnMethods = "C")
	 public void B() {
		 Reporter.log("TC B is runnig",true);
	 }
		 @Test
		 public void C() 
		 {
		 Assert.fail();
		 Reporter.log("TC C is running", true);
		 }
		 
		 
		 
	 }







