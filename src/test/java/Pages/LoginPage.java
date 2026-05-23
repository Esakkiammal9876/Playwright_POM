package Pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	//locators

	private Page page;
	private final String usernametextbox = "input[name='username']";
	private final String passwordtextbox = "input[name='password']";
	private final String loginbutton = "button[type='submit']";
	//constructor
	public LoginPage(Page page) {
		this.page = page;
	}
	
	public void addusername(String username) {
		page.fill(usernametextbox, username);
	}
	public void addpassword(String password) {
		page.fill(passwordtextbox, password);
	}
	public void clickloginbutton() {
		page.click(loginbutton);
	}
	
	public void Login(String username, String password) {
		page.fill(usernametextbox, username);
		page.fill(passwordtextbox, password);
		page.click(loginbutton); 
		
	}

}
