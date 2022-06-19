
package org.reportutils;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;
	public static ExtentTest test;
	private static String reportFileName = "Test-Automaton-Report" + ".html";
	private static String fileSeperator = System.getProperty("file.separator");
	private static String reportFilepath = System.getProperty("user.dir") + fileSeperator + "Reports";
	private static String reportFileLocation = reportFilepath + fileSeperator + reportFileName;

	public static ExtentReports getInstance() {
		if (extent == null) {
			createInstance();
		}
		return extent;
	}

	public static ExtentReports createInstance() {
		ExtentSparkReporter spark = new ExtentSparkReporter(reportFileLocation);
		extent = new ExtentReports();
		spark.config().setDocumentTitle("Addactin Cucumber Test");
		spark.config().setReportName("Cucumber Extent Report");
		try {
			spark.loadXMLConfig("avent-config.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
//  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportFileLocation); 
		// htmlReporter.loadConfig("html-config.xml");
		extent.attachReporter(spark);
		return extent;
	}

	public static ExtentTest createTestlog(String testName) {
		test = extent.createTest(testName);
		return test;
	}

	public static ExtentReports getExtent() {
		return extent;
	}
}
