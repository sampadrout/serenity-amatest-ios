package com.amaserenity;

import cucumber.api.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;

import static com.amaserenity.utils.AppiumServer.startAppiumServer;
import static com.amaserenity.utils.AppiumServer.stopAppiumServer;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = "com.amaserenity.steps"
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