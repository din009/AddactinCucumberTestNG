//package org.pagefactory;
//
//import org.commonutils.BaseUtils;
//import org.openqa.selenium.WebDriver;
//
//public class PageRepository extends BaseUtils{
//
//	private RegistrationPageObject reg;
//	private LoginPageObject login;
//	
//	public PageRepository(WebDriver _driver) {
//	this.driver=_driver;
//	}
//
//	public RegistrationPageObject getReg() {
//		reg = new RegistrationPageObject(driver);
//		return reg;
//	}
//	
//	public LoginPageObject getLogin() {
//		
//		login = new LoginPageObject(driver);
//		return login;
//	}
//	
//}
