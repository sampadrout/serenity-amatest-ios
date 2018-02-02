package com.amaserenity.steps;

import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

import com.amaserenity.pages.LoginPage;

public class LoginSteps extends ScenarioSteps{
	private static LoginPage loginPage;

	@Step
	public void loginPage(){
		loginPage.gotoLoginPage();
	}

	@Step
	public void enterLoginData(){
		loginPage.enterCredentials();
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
}