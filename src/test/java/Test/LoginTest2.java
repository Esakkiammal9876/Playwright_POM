package Test;

import org.testng.annotations.Test; 

import Baseclass.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest2 extends BaseTest {

	@Test
	public void test() {
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginpage.addusername("Admin");
		loginpage.addpassword("admin123");
		loginpage.clickloginbutton();
		homepage.clickTimeLink();
	}
}
