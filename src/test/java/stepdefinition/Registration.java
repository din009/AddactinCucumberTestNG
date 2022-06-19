package stepdefinition;

import org.commonutils.BaseUtils;
import org.openqa.selenium.WebDriver;
import org.pagefactory.RegistrationPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Registration extends BaseUtils{
	RegistrationPageObject page = new RegistrationPageObject(driver);
		
	@Given("launch the addactine Registration page")
	public void launch_the_addactine_Registration_page() {
//		driver = driverIniti("chrome");
		getUrl("https://adactinhotelapp.com/Register.php");
	}

	@When("Click on the Registration link on Login page")
	public void click_on_the_registration_link_on_login_page() {
//		page.getLogin().clickRegistration();
	}

	@When("input UserName field with {string}")
	public void input_user_name_field_with(String string) {
//		page.getReg().usernameinput(string);
		page.usernameinput(string);
	}

	@When("input Password field with {string}")
	public void input_password_field_with(String string) {
//		page.getReg().passwordInput(string);
		page.passwordInput(string);
	}

	@When("input confirmPassword field {string}")
	public void input_confirm_password_field(String string) {
//		page.getReg().confirmPasswordInput(string);
		page.confirmPasswordInput(string);
//		if(string.equalsIgnoreCase("Tests123")) {
//		throw new RuntimeException();
//		}
	}

	@When("input Fullname field {string}")
	public void input_fullname_field(String string) {
		
	}

	@When("input EmailId field {string}")
	public void input_email_id_field(String string) {

	}
}
