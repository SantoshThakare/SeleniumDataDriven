package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener ;
import org.testng.ITestResult;


public class Listener implements ITestListener {

	utility util= new utility();

	public void onStart(ITestContext context) {
		System.out.println("onStart method started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish method started");
	}

		public void onTestStart(ITestResult result) {
			System.out.println("New Test Started" +result.getName());
		}

		public void onTestSuccess(ITestResult result) {
			System.out.println("onTestSuccess Method" +result.getName());
		}

		public void onTestFailure(ITestResult result) {
			System.out.println("onTestFailure Method" +result.getName());

		//if test case fail then it will be take screenshot
			utility.takeScreenshots();
		}

		public void onTestSkipped(ITestResult result) {
			System.out.println("onTestSkipped Method" +result.getName());
		}


}

