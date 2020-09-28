package utility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	public static ExtentReports extent = new ExtentReports("./Reports/ExtentReport.html");
	public static ExtentTest test;
	static int i = 1;

	/**
	 * 
	 * @param testName
	 */
	public static void create(String testName) {
		test = extent.startTest(testName + i);
		i++;
	}

	/**
	 * 
	 * @param desc
	 * @param path
	 */
	public static void info(String desc, String path) {
		test.log(LogStatus.INFO, desc, test.addScreenCapture(path));
	}

	/**
	 * 
	 * @param desc
	 * @param path
	 */
	public static void pass(String desc, String path) {
		test.log(LogStatus.PASS, desc, test.addScreenCapture(path));
	}

	/**
	 * 
	 * @param desc
	 * @param path
	 */
	public static void fail(String desc, String path) {
		test.log(LogStatus.FAIL, desc, test.addScreenCapture(path));
	}

	/**
	 * 
	 * @param desc
	 */
	public static void failTest(String desc) {
		test.log(LogStatus.FAIL, desc);
	}

	/**
	 * 
	 * @param desc
	 */
	public static void passTest(String desc) {
		test.log(LogStatus.PASS, desc);
	}

	/**
	 * 
	 */
	public static void endTc() {
		extent.endTest(test);
	}

	/**
	 * 
	 */
	public static void ReportFlush() {
		extent.flush();
	}

}
