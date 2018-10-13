package com.amaserenity.steps.serenity;

import com.amaserenity.model.UserAccount;
import com.amaserenity.pages.LoginScreen;
import com.amaserenity.pages.CalendarScreen;
import com.amaserenity.pages.ContactsScreen;
import com.amaserenity.pages.TutorialScreen;
import com.amaserenity.pages.MainScreen;
import com.amaserenity.pages.SettingsScreen;

import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class UserSteps extends ScenarioSteps {

    LoginScreen loginScreen;
    CalendarScreen calendarScreen;
    ContactsScreen contactsScreen;
    TutorialScreen tutorialScreen;
    MainScreen mainScreen;
    SettingsScreen settingsScreen;

    @Step
    public void opens_login_screen() {
        loginScreen.openLoginScreen();
    }

    @Step
    public void enters_user_name(List<UserAccount> userAccounts) throws Throwable {
        loginScreen.enterUserName(userAccounts);
    }

    @Step
    public void enters_password(List<UserAccount> userAccounts) throws Throwable {
        loginScreen.enterPassword(userAccounts);
    }

    @Step
    public void enters_phone_number(List<UserAccount> userAccounts) throws Throwable {
        loginScreen.enterPhoneNo(userAccounts);
    }

    @Step
    public void taps_to_login() {
        loginScreen.tapLogin();
    }

    @Step
    public void sees_login_error_meesage() {
        loginScreen.isLoginFailedMsgShown();
    }

    @Step
    public void navigates_to_calendar_screen() {
        calendarScreen.isCalendarScreenShown();
    }

    @Step
    public void taps_to_select_local_calendar() {
        calendarScreen.selectLocalCalendar();
    }

    @Step
    public void taps_to_accept_calendar_permission_alert() {
        calendarScreen.acceptCalendarAlert();
    }

    @Step
    public void taps_to_Done() {
        calendarScreen.tapDone();
    }

    @Step
    public void navigates_to_contacts_screen() {
        contactsScreen.isContactsScreenShown();
    }

    @Step
    public void taps_on_Contacts() {
        contactsScreen.tapContacts();
    }

    @Step
    public void taps_to_accept_contacts_permission_alert() {
        contactsScreen.acceptContactsAlert();
    }

    @Step
    public void swipes_and_close_tutorial_screen() {
        tutorialScreen.closeTutorialScreen();
    }

    @Step
    public void navigates_to_main_screen() {
        mainScreen.isMainScreenShown();
    }

    @Step
    public void opens_settings_drawer() {
        mainScreen.openSettingsDrawer();
    }

    @Step
    public void taps_on_settings_option() {
        mainScreen.tapSettingsOption();
    }

    @Step
    public void navigates_to_settings_screen() {
        settingsScreen.isSettingsScreenShown();
    }

    @Step
    public void taps_on_signout() {
        settingsScreen.tapSignout();
    }

    @Step
    public void taps_to_confirms_signout() {
        settingsScreen.tapConfirmSignout();
    }

    @Step
    public void navigates_to_login_screen() {
        settingsScreen.tapConfirmSignout();
    }
}
