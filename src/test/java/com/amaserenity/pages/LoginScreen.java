package com.amaserenity.pages;

import com.amaserenity.model.UserAccount;
import com.amaserenity.utils.StringEncrypt;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class LoginScreen extends PageObject {

    @FindBy(accessibilityId="logo_cell")
    private WebElementFacade loginLogo;

    @FindBy(accessibilityId="emailAddress_textfield")
    private WebElementFacade emailAddress;

    @FindBy(accessibilityId="password_textfield")
    private WebElement password;

    @FindBy(accessibilityId="numberInputTextField")
    private WebElementFacade phoneNumber;

    @FindBy(accessibilityId="signInButton")
    private WebElementFacade signIn;

    @FindBy(accessibilityId="Failed to sign in")
    private WebElementFacade loginFailed;

    public void openLoginScreen(){
        element(loginLogo).waitUntilVisible();
    }

    public void enterUserName(List<UserAccount> userAccounts) throws Throwable {

        for (UserAccount userAccount : userAccounts) {
            element(emailAddress).sendKeys(userAccount.getUsername());
        }
    }

    public void enterPassword(List<UserAccount> userAccounts) throws Throwable {

        for (UserAccount userAccount : userAccounts) {
            element(password).sendKeys(userAccount.getPassword());
        }
    }

    public void enterPhoneNo(List<UserAccount> userAccounts) throws Throwable {

        for (UserAccount userAccount : userAccounts) {
            element(phoneNumber).sendKeys(userAccount.getPhonenumber());
        }
    }

    public void tapLogin(){
        element(signIn).waitUntilClickable().click();
    }

    public boolean isLoginFailedMsgShown(){
        return element(loginFailed).waitUntilVisible().getText().contentEquals("Failed to sign in");
    }

}