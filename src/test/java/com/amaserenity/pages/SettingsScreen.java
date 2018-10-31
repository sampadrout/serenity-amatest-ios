package com.amaserenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsScreen extends PageObject {

    @FindBy(accessibilityId = "Settings")
    private WebElementFacade settings;

    @FindBy(accessibilityId = "Sign Out")
    private WebElementFacade signOut;

    @FindBy(accessibilityId = "OK")
    private WebElementFacade confirmSignOut;

    public void isSettingsScreenShown() {
        element(settings).waitUntilVisible();
    }

    public void tapSignout() {
        element(signOut).waitUntilClickable().click();
    }

    public void tapConfirmSignout() {
        element(confirmSignOut).waitUntilClickable().click();
    }
}
