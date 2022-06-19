package org.pagefactory;

import org.commonutils.BaseUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageObject extends BaseUtils{
	
	public RegistrationPageObject(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}

	@FindBy (id = "username")
	public WebElement usernameId;
	@FindBy (id ="password")
	public WebElement passwordId;
	@FindBy (id ="re_password")
	public WebElement confirmPasswordId;
	@FindBy (xpath = "//*[@id='register_form']/table/tbody/tr[2]/td[1]")
	public WebElement usernameTextXapth;
	

	
	
	public void usernameinput(String username) {
		inputTextbox(usernameId, username);
	}
	public void passwordInput(String password) {
//		RegistrationPageObject reg = new RegistrationPageObject(driver);
		inputTextbox(passwordId, password);
	}
	public void confirmPasswordInput(String repassword) {
//		RegistrationPageObject reg = new RegistrationPageObject(driver);
		inputTextbox(confirmPasswordId, repassword);
	}
	public String usernameText() {
//		RegistrationPageObject reg = new RegistrationPageObject(driver);
		String value = getText(usernameTextXapth);
		return value;
	}
}
