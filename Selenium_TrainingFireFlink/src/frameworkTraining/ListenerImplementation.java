package frameworkTraining;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		FrameworkLibrary.screenshotMethod();
	}
}
