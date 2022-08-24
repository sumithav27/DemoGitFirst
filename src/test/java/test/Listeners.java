package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TEST CASES STARTED");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Hoorah! test case passed-code for screenshot  "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Oh! test case failed-code for failed screenshot  "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("due to some issue this test case skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("TEST FAILED BUT WITHIN SUCCESS PERCENTAGE :"+result.SUCCESS_PERCENTAGE_FAILURE);
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("STARTED before every Test folder");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("COMPLETED after every Test folder");
	}

}
