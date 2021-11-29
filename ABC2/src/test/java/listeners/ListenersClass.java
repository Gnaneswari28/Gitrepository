package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenersClass extends TestListenerAdapter{
public void onTestStart(ITestResult testresult) {
System.out.println("test started");

}
public void onTestSuccess(ITestResult testresult) {
System.out.println("test passed");

}public void onTestfail(ITestResult testresult) {
System.out.println("test failed");
}
public void onTestSkipped(ITestResult testresult) {
System.out.println("test skipped");

}
}