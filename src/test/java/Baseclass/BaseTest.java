package Baseclass;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import Utils.ExtentManager;

public class BaseTest {
	
	protected Playwright playwright;
	protected Browser browser;
	protected Page page;
	protected ExtentReports report;
	protected ExtentTest test;
	
	@BeforeMethod
	public void setup(Method method) {
		
		//Reporting 
		report = ExtentManager.getInstance();
		test = report.createTest(method.getName());
		
		playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		page = browser.newPage();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		//reporting logic
		if(result.getStatus() == ITestResult.FAILURE) {
			test.fail(result.getThrowable());
		}
		else if(result.getStatus() == ITestResult.SUCCESS) {
			test.pass("Test Passed");
		}
		else {
			test.skip("Test skipped");
		}
		report.flush();
		
		if(browser!=null) browser.close();
		if(playwright!=null) playwright.close();
	}
	

}
