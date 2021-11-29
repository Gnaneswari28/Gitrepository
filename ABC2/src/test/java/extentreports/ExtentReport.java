package extentreports;
import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

 
//import junit.framework.Assert;
public class ExtentReport {
	 
 
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void strtReport() {
	extent = new ExtentReports(System.getProperty( "C:/Users/lenovo/eclipse-workspace/ABC/test-output/MyReports.html"));
 	extent.addSystemInfo("Host Name","LocalHost");
	extent.addSystemInfo("Environment"," QA");
	extent.addSystemInfo("User Name","Gnaneswari");
    extent.loadConfig(new File(System.getProperty("user.dir")+"// extentconfig.xml"));

	}
	@Test
	public void demoReportPass() {
	test=extent.startTest( "demoReportPass");
	Assert.assertTrue(true);
	test.log(LogStatus.PASS,  "Assert pass");
	}
	@Test
	public void demoReportFail() {
	test=extent.startTest( "demoReportFail");
	Assert.assertTrue(false);
	test.log(LogStatus.FAIL,  "Assert fail");
	}
	
	    @AfterMethod  
	    public void getResult(ITestResult result) {
	    if(result.getStatus()==ITestResult.FAILURE)
	    {
	    test.log(LogStatus.FAIL,result.getThrowable() );
	    }
	    extent.endTest(test);
	    }
	    @AfterTest
	    public void endreport() {
	    extent.flush();
	    extent.close();
	   
	    }

	}


