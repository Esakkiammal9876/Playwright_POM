package Test;

import org.testng.SkipException;
import org.testng.annotations.Test; 

import Baseclass.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest2 extends BaseTest {

	@Test
	public void test1 () {
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		
		test.info("NAvigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("Adding username");
		loginpage.addusername("Admin");
		test.info("Adding password");
		loginpage.addpassword("admin123");
		test.info("Click on the login buttton");
		loginpage.clickloginbutton();
		test.info("Checking link ");
		homepage.clickTimeLink();
	}
	@Test
	public void test2() {
		test.skip("Skipping this test");
		throw new SkipException("Skipping this test");
	}
	@Test
	public void test3() {
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		
		test.info("NAvigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("Adding username");
		loginpage.addusername("Admisn");
		test.info("Adding password");
		loginpage.addpassword("admin123");
		test.info("Click on the login buttton");
		loginpage.clickloginbutton();
		test.info("Checking link ");
		homepage.clickTimeLink();
	}
	
	@Test
	public void test4() {
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		
		test.info("NAvigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("Adding username");
		loginpage.addusername("");
		test.info("Adding password");
		loginpage.addpassword("");
		test.info("Click on the login buttton");
		loginpage.clickloginbutton();
		test.info("Checking link ");
		homepage.clickTimeLink();
	}
	
	@Test
	public void test5() {
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		
		test.info("NAvigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("Adding username");
		loginpage.addusername("Admin");
		test.info("Adding password");
		loginpage.addpassword("admin1223");
		test.info("Click on the login buttton");
		loginpage.clickloginbutton();
		test.info("Checking link ");
		homepage.clickTimeLink();
	}
}
