package com.amaserenity.pages;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainScreen extends PageObject {

    @FindBy(accessibilityId="Daily View")
    private WebElementFacade mainScreen;

    @FindBy(accessibilityId="ToggleSettingsButton")
    private WebElementFacade openDrawer;

    @FindBy(accessibilityId="Settings")
    private WebElementFacade settingsOption;

    public void isMainScreenShown() {
        element(mainScreen).waitUntilVisible();
    }

    public void openSettingsDrawer() {
        element(openDrawer).click();
    }

    public void tapSettingsOption() {
        element(settingsOption).waitUntilClickable().click();
    }

}
