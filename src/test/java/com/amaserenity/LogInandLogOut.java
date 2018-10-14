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
		features = "src/test/resources/features/login.feature"
//		glue = "com.amaserenity.steps.LoginScenarioSteps"
		)

public class LogInandLogOut {
	
/*	This is to manage webdriver instance by serenity */
	
//	@Managed(uniqueSession = true)
//	WebDriver appiumDriver;
	
    @BeforeClass
    public static void setUp() throws IOException, Exception {
        startAppiumServer();
    }

    @AfterClass
    public static void tearDown() throws IOException {
        stopAppiumServer();
    }   
}