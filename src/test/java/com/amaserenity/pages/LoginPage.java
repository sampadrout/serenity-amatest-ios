/*
 * Login Page
 * by Sampad Rout
 * © Thinkrite Inc.
 */

package com.amaserenity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{
	
	@FindBy(id="com.thinkrite.assistant:id/emailEditText")
	private WebElementFacade emailAddress;
	
	@FindBy(id="com.thinkrite.assistant:id/passwordEditText")
	private WebElement password;

	@FindBy(id="com.thinkrite.assistant:id/e164PhNumEditText")
	private WebElementFacade phoneNumber;
	
	@FindBy(id="com.thinkrite.assistant:id/buttonSignIn")
	private WebElementFacade signIn;

	@FindBy(xpath="//*[@text='Calendars']")
	private WebElementFacade calendar;
	
	@FindBy(id="com.thinkrite.assistant:id/checkBoxThisDevice")
	private WebElementFacade googlecalendarCheckbox;

	@FindBy(id="com.android.packageinstaller:id/permission_allow_button")
	private WebElementFacade allowCalendarAlert;

	@FindBy(id="com.thinkrite.assistant:id/checkBoxOutlook")
	private WebElementFacade exchangecalendarCheckbox;

	@FindBy(id="com.thinkrite.assistant:id/done")
	private WebElementFacade btnCalendarSave;

	@FindBy(xpath="//*[@text='New Calendar']")
	private WebElementFacade newExchangeCalendar;

	public void gotoLoginPage(){
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.thinkrite.assistant:id/logoLogin")) );
	}

	public void enterCredentials(){
		element(emailAddress).sendKeys("traqatest2@gmail.com");                
		element(password).sendKeys("welcometr1");
		element(phoneNumber).sendKeys("9546532544");
//		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.thinkrite.assistant:id/buttonSignIn")));
		element(signIn).waitUntilClickable().click();
	}

	public boolean isCalendarPageShown(){
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Calendars']")) );
		return element(calendar).getText().contentEquals("Calendars");
	}
	
	public void selectLocalCalendar(){
		element(googlecalendarCheckbox).click();
	}

	public void acceptCalendarAlert(){
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
		element(allowCalendarAlert).click();
	}
	
	public void selectEWSCalendar(){
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.thinkrite.assistant:id/checkBoxOutlook")));
		element(exchangecalendarCheckbox).click();
	}
	
	public void tapDone(){
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.thinkrite.assistant:id/done")));
		element(btnCalendarSave).click();
	}
	
	public boolean isEWSPageShown(){
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='New Calendar']")) );
		return element(newExchangeCalendar).getText().contentEquals("New Calendar");
	}
}