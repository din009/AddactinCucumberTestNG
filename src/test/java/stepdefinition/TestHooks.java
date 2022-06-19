package stepdefinition;

import org.commonutils.BaseUtils;
import org.openqa.selenium.WebDriver;
import org.reportutils.ExtentManager;

import com.aventstack.extentreports.MediaEntityBuilder;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TestHooks extends BaseUtils {
	WebDriver _driver = null;

	@Before
	public void driverinit(Scenario scenario) {
		this._driver = driverIniti("chrome");
		super.driver = _driver;	
		ExtentManager.createTestlog(scenario.getName());
	}

	@After
	public void teardown() {
		driverclose();
	}


	@AfterStep()
	public void afterscenario(Scenario scenario ) {
		
		try {
			if (!scenario.isFailed()) {
				ExtentManager.test.pass(scenario.getName(),
						MediaEntityBuilder
								.createScreenCaptureFromPath("data:image/png;base64," + screenshot(scenario.getName()))
								.build());
//				String sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//				String screenshotName = scenario.getName().replaceAll(" ", "_");
//			File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
//			FileUtils.copyFile(sourcePath, destinationPath);
//			ExtentCucumberAdapter.addTestStepLog(scenario.getName());
//			ExtentCucumberAdapter.addTestStepScreenCaptureFromPath("data:image/png;base,"+sourcePath);

			}
		} catch (Exception e) {

			ExtentManager.test.fail(e.getStackTrace().toString(), MediaEntityBuilder
					.createScreenCaptureFromPath("data:image/png;base64," + screenshot(scenario.getName())).build());
		}
	}





}
