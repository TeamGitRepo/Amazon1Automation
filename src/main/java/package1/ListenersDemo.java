package package1;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.Amazon1Automation.QA.Util.CaptureScreenShot;

public class ListenersDemo implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("*********The Test is started ************");
	//	CaptureScreenShot.CaptureScreenShot();
	
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("*********The Test is success ************");
		CaptureScreenShot.CaptureScreenShot();
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("*********The Test is failure ************");
		CaptureScreenShot.CaptureScreenShot();
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
	  
		System.out.println("*********The Test is skipped ************");
		CaptureScreenShot.CaptureScreenShot();
	}	
	
	
	
}
