package Pages;

import com.microsoft.playwright.Page;

public class HomePage {
	
	private Page page;
	private final String timelink = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(4) > a";
	
	public HomePage(Page page) {
		this.page = page;
	}
	
	public void clickTimeLink() {
		page.click(timelink);
	}

}
