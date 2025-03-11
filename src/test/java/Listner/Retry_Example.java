package Listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Example implements IRetryAnalyzer {

    private int retrycount = 0;
    private int maxcount = 3;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retrycount < maxcount) {
            retrycount++;

            return true;

        }
return false;
    }
}
