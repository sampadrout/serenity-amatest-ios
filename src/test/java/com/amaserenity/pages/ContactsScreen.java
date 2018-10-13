package com.amaserenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactsScreen extends PageObject {

    @FindBy(xpath="//*[@text='Contacts']")
    private WebElementFacade contacts;

    @FindBy(id="com.thinkrite.assistant:id/buttonOk")
    private WebElementFacade btnContactsOK;

    @FindBy(id="com.android.packageinstaller:id/permission_allow_button")
    private WebElementFacade allowContactsAlert;

    public void isContactsScreenShown(){
        element(contacts).waitUntilVisible();
    }

    public void tapContacts() {
        element(btnContactsOK).click();
    }

    public void acceptContactsAlert(){
        element(allowContactsAlert).waitUntilVisible().click();
    }

}
