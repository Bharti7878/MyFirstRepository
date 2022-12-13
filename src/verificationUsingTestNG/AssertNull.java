package verificationUsingTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void MyTC() {
  
	  String a="ABC";
	  //TC should be passed if a is null
	  Assert.assertNull(a, "A value is not null TC is FAILED");

  
  
  }
}
