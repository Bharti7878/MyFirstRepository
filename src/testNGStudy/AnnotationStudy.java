package testNGStudy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void myTest1() {
  
	  Reporter.log("myTest1 test method is running",true);
  }
  @Test
  public void myTest2() {
	  Reporter.log("myTest2 test method is running",true);
  }

@BeforeMethod
public void bm() {
	
	Reporter.log("before method is runnig",true);
}
  @AfterMethod
  public void am() {
	  Reporter.log("after method is running",true);
  }
@AfterClass
public void afterClass()
{
Reporter.log("After class is running", true);
}
@BeforeClass
public void bc() {
	
	Reporter.log("before class is running",true);
}
}
