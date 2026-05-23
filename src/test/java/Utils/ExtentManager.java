	package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	private static ExtentReports report;
	public static ExtentReports getInstance() {
		if(report == null) {
			ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/ExtentReport.html");
			report = new ExtentReports();
			report.attachReporter(reporter);
		}
		return report;
	}

}
