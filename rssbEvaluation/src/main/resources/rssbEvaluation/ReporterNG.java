package rssbEvaluation;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReporterNG {
	
//static ExtentReports extent;
	
	public static ExtentReports getReportObject()
	//public void getReportObject()
	{
		//path
		String path = System.getProperty("user.dir")+"//reports//index.html";
		
		//ExtentSparkReport
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("FB Challenge Report");
		reporter.config().setDocumentTitle("RSSB CHALLENGE");
		
		//ExtentRport
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Samuel BYIRINGIRO");
		return extent;
				
	}
}
