package testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersTng implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("on Test Start",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("on Test success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("on Test Failure",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("on Test Skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("on TestFailureButWithinSuccessPercentage",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("on TestFailedWithTimeout",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("on Start",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("on Finish",true);
	}
	
}
