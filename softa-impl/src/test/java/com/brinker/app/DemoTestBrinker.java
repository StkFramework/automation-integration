package com.brinker.app;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/feature/Demo.feature" },
		glue = { "com.softtek.automation.steps.cucumber","com.org.test.steps" },
		format = { "pretty", "html:cucumber-html-reports", "json:cucumber-html-reports/cucumber.json" },
		tags = { "@Demo", "~@ignore" })
public class DemoTestBrinker {
}