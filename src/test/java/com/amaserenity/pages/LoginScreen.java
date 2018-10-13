package com.amaserenity.pages;

import com.amaserenity.model.UserAccount;
import com.amaserenity.utils.StringEncrypt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class LoginScreen extends PageObject {

    @FindBy(id="com.thinkrite.assistant:id/logoLogin")
    private WebElementFacade loginLogo;

    @FindBy(id="com.thinkrite.assistant:id/emailEditText")
    private WebElementFacade emailAddress;

    @FindBy(id="com.thinkrite.assistant:id/passwordEditText")
    private WebElement password;

    @FindBy(id="com.thinkrite.assistant:id/e164PhNumEditText")
    private WebElementFacade phoneNumber;

    @FindBy(id="com.thinkrite.assistant:id/buttonSignIn")
    private WebElementFacade signIn;

    @FindBy(id="android:id/message")
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
        return element(loginFailed).waitUntilVisible().getText().contentEquals("Login failed due to an incorrect username or password.");
    }

}