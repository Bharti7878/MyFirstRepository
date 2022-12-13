package verificationUsingTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void  MyTC()
 {
  
  boolean a=false;
//TC should be passed if a is false
  
  Assert.assertFalse("A is true Tc is failed", a);

  }
}
