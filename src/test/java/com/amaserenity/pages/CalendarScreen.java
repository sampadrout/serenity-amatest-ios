package com.amaserenity.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarScreen extends PageObject {

    @FindBy(xpath="//*[@text='Calendars']")
    private WebElementFacade calendar;

    @FindBy(id="com.thinkrite.assistant:id/checkBoxThisDevice")
    private WebElementFacade googlecalendarCheckbox;

    @FindBy(id="com.android.packageinstaller:id/permission_allow_button")
    private WebElementFacade allowCalendarAlert;

    @FindBy(id="com.thinkrite.assistant:id/done")
    private WebElementFacade btnCalendarSave;

    public void isCalendarScreenShown(){
        element(calendar).waitUntilVisible();
    }

    public void selectLocalCalendar(){
        element(googlecalendarCheckbox).click();
    }

    public void acceptCalendarAlert(){
        element(allowCalendarAlert).waitUntilVisible().click();
    }

    public void tapDone(){
        element(btnCalendarSave).waitUntilEnabled().click();
    }
}
