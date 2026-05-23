package Baseclass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseTest {
	
	protected Playwright playwright;
	protected Browser browser;
	protected Page page;
	
	@BeforeMethod
	public void setup() {
		playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		page = browser.newPage();
	}
	
	@AfterMethod
	public void tearDown() {
		if(browser!=null) browser.close();
		if(playwright!=null) playwright.close();
	}
	

}
