package verificationUsingTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void TrueUse() {
	  boolean a=false;
	  //if a is true then TC should b passed
	  
	org.testng.Assert.assertTrue(a, "TC is failed if a is false");
  
  
  }
}
