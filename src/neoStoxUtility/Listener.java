package neoStoxUtility;

import java.io.IOException;

import org.testng.ITestListener;

import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.BaseNew;

public class Listener extends BaseNew implements ITestListener{
@Override
	public void onTestSuccess(ITestResult result) {
	String MethodName =result.getName();
Reporter.log("TC"+MethodName+"Is completed successfully",true);
}


@Override
public void onTestFailure(ITestResult result) 
{
Reporter.log("TC "+result.getName()+ " is failed",true);
try {
UtilityNew.takesreenShot(driver, result.getName());
} 
catch (IOException e) {
e.printStackTrace();
}

}





@Override
public void onTestSkipped(ITestResult result) {
	Reporter.log("Tc"+result.getName()+"is skipped please check",true);
	
}

}
