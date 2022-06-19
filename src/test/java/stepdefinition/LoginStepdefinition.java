package stepdefinition;

import javax.security.auth.login.LoginException;

import org.commonutils.BaseUtils;
import org.pagefactory.LoginPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinition extends BaseUtils{

	LoginPageObject login = new LoginPageObject(driver);
	
	@Given("launch the addactine Login page")
	public void launch_the_addactine_login_page() {
//		BaseUtils.driver = driverIniti("chrome");
		getUrl("https://adactinhotelapp.com/");
	}

	@When("input UserName field with {string} in LoginWebsite")
	public void input_user_name_field_with_in_LoginWebsite(String string) {
//		login.getLogin().inputUsername(string);
		login.inputUsername(string);
	}

	@When("input Password field with {string} in LoginWebsite")
	public void input_password_field_with(String string) {
//		login.getLogin().inputPassword(string);
		login.inputPassword(string);
	}

	@When("Click Login button")
	public void click_login_button() {
//		login.getLogin().clickLoginButton();
		login.clickLoginButton();
	}

	@Then("check user loggedin")
	public void check_user_loggedin() throws LoginException {
//	   if(login.getLogin().getLoginError().startsWith("Invalid Login details or Your Password might have expired.")) {
//		  throw new LoginException(login.getLogin().getLoginError()); 
//	   }
		   if(login.getLoginError().startsWith("Invalid Login details or Your Password might have expired.")) {
				  throw new LoginException(login.getLoginError()); 
			   }
	}
}
