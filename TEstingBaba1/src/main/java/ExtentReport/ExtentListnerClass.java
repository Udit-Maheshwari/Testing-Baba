package ExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListnerClass implements ITestListener
{
	ExtentSparkReporter htmlReport;
	ExtentReports reports;
	ExtentTest test;
	public void configReport()
	{
		htmlReport=new ExtentSparkReporter("Extent Report Demo.html");
		reports= new ExtentReports();
		reports.attachReporter(htmlReport);
		
		//add system information/environment information
		reports.setSystemInfo("Machine", "testpc1");
		reports.setSystemInfo("OS", "window 10");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("User-Name", "Udit");
		
		//configuration to change look and feel report
		htmlReport.config().setDocumentTitle("Extent Report Demo");// report heading
		htmlReport.config().setReportName("this is my first report name");// for report name
		htmlReport.config().setTheme(Theme.DARK);
		
	}
	
	public void onStart(ITestContext context) 
	{
		configReport();
	}
	
	public void onTestFailure(ITestResult result)
	{
		test=reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of fail test case is +" +result.getName(), ExtentColor.RED));
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		test=reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of pass test case is +" +result.getName(), ExtentColor.GREEN));
	}
	
	public void onFinish(ITestContext context)
	{
		reports.flush();// jo bhi data chahte hai report me print kar wana wo iss flush ke through he jayegaa
	}

}
