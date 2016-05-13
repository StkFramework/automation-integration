package com.example.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This class will start all the test cases.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/feature/search-request-test.feature" },
		glue = { "com.softtek.automation.steps.cucumber","com.example.test.steps" },
		format = { "pretty", "html:cucumber-html-reports", "json:cucumber-html-reports/cucumber.json" },
		tags = { "@test", "~@ignore" })
public class RunAppTest {
}