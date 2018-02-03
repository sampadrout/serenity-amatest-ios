package com.amaserenity.runner;


import static com.amaserenity.utils.AppiumServer.startAppiumServer;
import static com.amaserenity.utils.AppiumServer.stopAppiumServer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features={"src/test/resources/features/login.feature","src/test/resources/features/selectcalendar.feature"},plugin = {"pretty"})
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = "com.amaserenity.stepdefinations"
		)

public class TestSuiteRunner {
	
//	@Managed
//    WebDriver appiumDriver;
	
    @BeforeClass
    public static void startAppium() {
        startAppiumServer();
    }

    @AfterClass
    public static void stopAppium() {
        stopAppiumServer();
    }   
}