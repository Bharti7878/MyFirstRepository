package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority = 1)
  public void A() {
	  Reporter.log("A TC is running", true);
  }
 @Test(priority = -1)
  public void C() 
  {
  Reporter.log("C TC is running", true);
  }
 @Test(priority = -2)
  public void D() 
  {
  Reporter.log("D TC is running", true);
  }
 @Test
  public void B()//if no priority then it is consider as 0 
  {
  Reporter.log("B TC is running", true);
  }

  
  
  
  }

