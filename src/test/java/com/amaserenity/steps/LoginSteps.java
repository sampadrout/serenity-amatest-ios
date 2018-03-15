package com.amaserenity.steps;

import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;

import com.amaserenity.model.UserAccount;
import com.amaserenity.pages.LoginPage;

import cucumber.api.DataTable;

public class LoginSteps extends ScenarioSteps{
	LoginPage loginPage;
	
	@Step
	public void loginPage(){
		loginPage.gotoLoginPage();
	}

	@Step
	public void enterUsernameAndPassword(List<UserAccount> userAccounts) throws Throwable {
		loginPage.enterCredentials(userAccounts);
	}
	
	@Step
	public void checkLoginFailedMsg(){
		assertThat(loginPage.isLoginFailedMsgShown()).isTrue();
	}
	
	@Step
	public void checkCalendarPage(){
		assertThat(loginPage.isCalendarPageShown()).isTrue();
	}
	
	@Step
	public void selectLocalCalendar(){
		loginPage.selectLocalCalendar();
	}
	
	@Step
	public void acceptCalendarAlert(){
		loginPage.acceptCalendarAlert();
	}
	
	@Step
	public void selectEWSCalendar(){
		loginPage.selectEWSCalendar();
	}
	
	@Step
	public void tapDone(){
		loginPage.tapDone();
	}
	
	@Step
	public void checkEWSPage(){
		assertThat(loginPage.isEWSPageShown()).isTrue();

	}
	
//	@Step
//	public void addExchangeAccount(){
//		assertThat(loginPage.enterExchangeAccountDetails());
//
//	}
}