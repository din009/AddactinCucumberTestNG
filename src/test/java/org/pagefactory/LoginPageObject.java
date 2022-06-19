package org.pagefactory;

import org.commonutils.BaseUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject extends BaseUtils {

	public LoginPageObject(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	@FindBy(id = "username")
	public WebElement userName;
	@FindBy(id = "password")
	public WebElement password;
	@FindBy(id = "login")
	public WebElement loginButton;
	@FindBy(xpath = "//*[contains(text(),'New User Register Here')]")
	public WebElement Registrationlink;
	@FindBy(xpath = "//*[@id=\"login_form\"]/table/tbody/tr[5]/td[2]/div")
	public WebElement authError;


	public void clickRegistration() {
		clickElement(Registrationlink);
	}

	public void inputUsername(String username) {
		inputTextbox(userName, username);
	}

	public void inputPassword(String passwords) {
		inputTextbox(password, passwords);
	}

	public void clickLoginButton() {
		clickElement(loginButton);
	}
	public String getLoginError() {
		return authError.getText();
	}
}
