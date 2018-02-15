package Strings;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public  class RetryClass implements IRetryAnalyzer{
	int count=0;
	int maxCount=4;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count <maxCount )
		{
			count++;
			return true;
		}
		return false;
	}

}
