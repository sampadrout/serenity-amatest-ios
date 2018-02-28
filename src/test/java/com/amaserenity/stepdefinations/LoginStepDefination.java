package com.amaserenity.stepdefinations;

import com.amaserenity.steps.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.PendingException;

import net.thucydides.core.annotations.Steps;

public class LoginStepDefination {

	@Steps
	LoginSteps  loginSteps;

	@Given("User is on login page")
	public void gotoLoginPage(){
		loginSteps.loginPage();
	}

	@When("Enter valid credentials")
	public void enterValidData(){
		loginSteps.enterLoginData();
	}

	@Then("User is shown calendar page")
	public void checkCalendarPage(){
		loginSteps.checkCalendarPage();
	}

	@Then("Select Local Calendar")
	public void selectLocalCalendar(){
		loginSteps.selectLocalCalendar();
	}
	
	@And("Accept calendar Alert")
	public void acceptAlert(){
		loginSteps.acceptCalendarAlert();
	}
	
	@And("Select EWS Calendar")
	public void selectEWSCalendar(){
		loginSteps.selectEWSCalendar();
	}
	
	@And("Tap Done")
	public void tapDone(){
		loginSteps.tapDone();
	}
	
	@Then("Display EWS page to enter details")
	public void checkEWSpage(){
		loginSteps.checkEWSPage();
	}
	
	@Then("Enter Exchange Account details")
	public void addExchangeAccount(){
		throw new PendingException("Not finished yet");
//		loginSteps.addExchangeAccount();
	}
	

}
