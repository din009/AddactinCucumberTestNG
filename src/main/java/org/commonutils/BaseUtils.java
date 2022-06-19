package org.commonutils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class BaseUtils {

	public static WebDriver driver;
//	public WebDriver driverInitializer() {
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setAcceptInsecureCerts(true);		
//		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		cap.acceptInsecureCerts();
//		ChromeOptions options = new ChromeOptions();
//		options.merge(cap);
//		options.addArguments("start-maximized");
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\dimurugan\\eclipse-workspace\\AIIT\\Selenium\\lib\\chromedriver.exe" );
//		driver = new ChromeDriver(options);
//		return driver;
//	}

	public WebDriver driverIniti(String browser) {
		System.out.println("Hello World");
		if(browser.equals("chrome")) {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setAcceptInsecureCerts(true);		
			cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			cap.acceptInsecureCerts();
			cap.setBrowserName("chrome");
			cap.setVersion("102.0.5005.115");
			ChromeOptions options = new ChromeOptions();
			options.merge(cap);
			options.addArguments("start-maximized");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		}else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/main/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		}
//		driver.manage().window().maximize();
		return driver;
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void inputTextbox (WebElement element, String input) {
		element.sendKeys(input);
	}
	
	public void radioButton(WebElement element) {
		element.click();
	}

	public void dropdown(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void clickElement(WebElement element) {
		element.click();
	}
	public String getText(WebElement element) {
		return element.getText();
	}
	public void driverclose() {
		driver.close();
	}
	public String screenshot(String screenshotName) {
//		String simpledate = new SimpleDateFormat("yyyyMMddhhmmsssss").format(new Date());
//		TakesScreenshot ts= (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		String desPath = System.getProperty("user.dir")+"/FailedTestsScreenshots/"+screenshotName+simpledate;
//		File des = new File(desPath);
//		FileUtils.copyFile(source, des);
		String screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		return screenshotAs;
	}
	
	
}
