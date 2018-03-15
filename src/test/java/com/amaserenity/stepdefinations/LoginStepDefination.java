package com.amaserenity.stepdefinations;

import java.util.List;

import com.amaserenity.model.UserAccount;
import com.amaserenity.steps.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.DataTable;
import cucumber.api.PendingException;

import net.thucydides.core.annotations.Steps;

public class LoginStepDefination {
	
	List<UserAccount> userAccounts;
	
	@Steps
	LoginSteps  loginSteps;

	@Given("User is on login page")
	public void gotoLoginPage(){
		loginSteps.loginPage();
	}

	@When("user logs in using valid credentials as below")
	public void when_user_enters_all_the_login_details(List<UserAccount> userAccounts) throws Throwable {
		loginSteps.enterUsernameAndPassword(userAccounts);
		loginSteps.checkCalendarPage();
		loginSteps.selectLocalCalendar();
		loginSteps.acceptCalendarAlert();
		loginSteps.selectEWSCalendar();
		loginSteps.tapDone();
	}
	
	@Then("he should be given access to the app")
	public void user_landed_on_daily_view(){
		loginSteps.checkEWSPage();
//		loginSteps.addExchangeAccount();
	}
	
	@When("user logs on with wrong password as below")
	public void when_user_enters_wrong_username_and_password(List<UserAccount> userAccounts) throws Throwable {
		loginSteps.enterUsernameAndPassword(userAccounts);
	}
	
	@Then("he should be informed that his password was incorrect")
	public void wrong_username_pawd_displayed_to_user(){
		loginSteps.checkLoginFailedMsg();
	}
}
