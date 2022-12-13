package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
 
	
	@Test(dependsOnMethods= {"B"},priority=-1)
  public void A() {
  Reporter.log("A TC is running", true);
	  
  }
 
  @Test
  public void c() {
	  Reporter.log("c TC is running", true);
}
  
  @Test
  public void D () 
  {
	  
	  Reporter.log("D TC is running", true);
  }
 @Test
  public void B()
  {
 
	//assert.fail();
 Reporter.log("B TC is running", true);  
  }
  
 }

