package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals  {
  @Test
  public void TC1() {
 
 String a="pune";
 String b="pune";

 //I need to verify a and b are equal or not?
//if a and b are equal TC is passed or TC is failed
 
 /*if(a.equals(b))
 {
	 Reporter.log("a and b are matching TC is passed", true);
 }
 else {
	 Reporter.log("a and b are not matching TC is failed", true);
 }*/
  
//using Hard assert using static methods of Assert class
//1) assertEquals()
 
 Assert.assertEquals(a,b,"A and B is not maching TC is failed");
 
 
  }
}
