package softAsserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEquals {
  
	SoftAssert soft=new SoftAssert();
	
 /* @Test
  public void Testing() {
	  String a="abc";
	  String b="abc";
	  String c="xyz";
	  
	  soft.assertEquals(a, b,"a and b are not equal TC is Failed");
      soft.assertEquals(a, c,"A and C are not equal TC failed");
	  soft.assertAll();
  }*/
  
  @Test
 public void Testing12() {
		  
	  boolean a=true;
	  
	  soft.assertTrue(a,"A is false TC is Failed");
	  soft.assertNull(a);
	  soft.assertAll();	  
		  
	  }
  }

