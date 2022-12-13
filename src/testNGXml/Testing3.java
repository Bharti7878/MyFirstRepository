package testNGXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing3 {
  @Test(groups="un")
  public void A() {
 Reporter.log("A TC is running",true);
  }

@Test(groups="funds")
public void c() {
	Reporter.log("C TC is runnig",true);
}

@Test()
public void D() {
	Reporter.log("D TC is runnig",true);
}

@Test(groups="un")
public void B() 
{
Reporter.log("B TC is runnig",true);	
}

}




