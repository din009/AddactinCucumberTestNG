package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/rerun.txt", glue = "stepdefinition", plugin = { "pretty",
		"html:target1/cucumber-html-report.html", "json:target1/cucumber.json" })
public class TestNGRunnerReRun extends AbstractTestNGCucumberTests {

}
