package org.runner;

import org.reportutils.ExtentManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber.json",
//		"pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
//		"junit:target/cucumber-results.xml","rerun:target/rerun.txt" }, features = "./src/test/resources/features/", glue = {
//				"stepdefinition" }, monochrome = true)
@CucumberOptions(plugin = { 
		"rerun:target/rerun.txt" }, features = "./src/test/resources/features/", glue = {
				"stepdefinition" }, monochrome = true)
public class TestNGRunner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public void initReport() {
		ExtentManager.getInstance();
	}
	@AfterSuite
	public void closeReport() {
		ExtentManager.getInstance().flush();
	}
}
