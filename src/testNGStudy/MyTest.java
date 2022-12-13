package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  
	@Test
  public void A() {
 System.out.println("Method A is runnig");
 Reporter.log("A method is runnig ---:log");
 Reporter.log("A method is runnig using ---:log true", true);
  }
 
  @Test
 public void B()
 {
 
 System.out.println("B method is running");
 Reporter.log("B method running using--:log");
 Reporter.log("B method running using--:log true", true);
  }
}
