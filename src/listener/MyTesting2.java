package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.Listener.class)
public class MyTesting2 {
	
@Test
public void D() 
{
Reporter.log("TC D is running", true);
}
@Test(dependsOnMethods = "F")

public void E() 
{
Reporter.log("TC E is running", true);
}

@Test
public void F() 
{
Assert.fail();
Reporter.log("TC F is running", true);
}}