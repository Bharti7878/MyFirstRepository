package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {

@Override
public void onTestSuccess(ITestResult result) {

String MethodName=result.getName();
Reporter.log("TC"+MethodName+" is Completed Successfully",true);

}
@Override
public void onTestFailure(ITestResult result) {
	Reporter.log("TC" +result.getName()+" is failed",true);
}

@Override
public void onTestSkipped(ITestResult result) {
	Reporter.log("TC"+ result.getName()+" is skipped pls check",true);


}
}




