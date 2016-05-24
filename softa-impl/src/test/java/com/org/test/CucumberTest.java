package com.org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/feature/login-test.feature" },
		glue = { "com.softtek.automation.steps.cucumber","com.org.test.steps" },
		format = { "pretty", "html:cucumber-html-reports", "json:cucumber-html-reports/cucumber.json" },
		tags = { "@test", "~@ignore" })
public class CucumberTest {
}