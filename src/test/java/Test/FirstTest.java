package Test;

import org.testng.annotations.Test; 

import Baseclass.BaseTest;

public class FirstTest extends BaseTest {

	@Test
	public void verifyTitle() {
		page.navigate("https://www.google.com/ncr");
		
		//ncr means No Country Redirect
		//Optional : Handle cookie pop-up
		try {
		if (page.isVisible("button:has-text('Accept all')"));
		page.click("button:has-text('Accept all')");
		}
		catch(Exception e) {
			System.out.println("Cookie pop up not found");
		}
		System.out.println("The page title is:" + page.title());
	}	

}
