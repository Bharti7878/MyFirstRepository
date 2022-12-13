package testNgKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testing {
  @Test(invocationCount =5)
  public void A() {
 
	  Reporter.log("A TC is running", true);
  }
}
