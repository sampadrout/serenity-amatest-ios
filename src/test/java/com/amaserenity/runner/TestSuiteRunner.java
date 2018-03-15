package com.amaserenity.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.amaserenity.utils.AppiumServer.startAppiumServer;
import static com.amaserenity.utils.AppiumServer.stopAppiumServer;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = "com.amaserenity.stepdefinations"
		)

public class TestSuiteRunner {
	
/*	This is to manage webdriver instance by serenity */
	
//	@Managed(uniqueSession = true)
//	WebDriver appiumDriver;
	
    @BeforeClass
    public static void setUp() throws IOException {
        startAppiumServer();
    }

    @AfterClass
    public static void tearDown() throws IOException {
        stopAppiumServer();
    }   
}