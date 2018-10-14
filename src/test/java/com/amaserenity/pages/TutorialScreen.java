package com.amaserenity.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;


public class TutorialScreen extends PageObject {

/*
    @FindBy(id="com.thinkrite.assistant:id/imageView")
    private WebElementFacade coachMark;

    @FindBy(xpath="//android.widget.ImageView[@content-desc=\"Coach mark\"]")
    private WebElementFacade coachMark;
*/


    @FindBy(id="com.thinkrite.assistant:id/three")
    private WebElementFacade btnToThirdPage;

    @FindBy(id="com.thinkrite.assistant:id/fontTextViewClose")
    private WebElementFacade btnClose;


    public void closeTutorialScreen(){

//        TouchAction swipe = new TouchAction(((AppiumDriver)((WebDriverFacade) getDriver()).getProxiedDriver()));

/*        TouchAction swipe = new TouchAction(getDriver);
        swipe.press(1030, 995);
        swipe.moveTo(19, 991)
        swipe.release();
        swipe.perform();*/
/*
        TouchAction swipe_coach_mark1 = new TouchAction(((AppiumDriver)((WebDriverFacade) getDriver()).getProxiedDriver()))
                .press(PointOption.point(1030,995))
                .moveTo(PointOption.point(19, 991))
                .release()
                .perform();

        TouchAction swipe_coach_mark2 = new TouchAction(((AppiumDriver)((WebDriverFacade) getDriver()).getProxiedDriver()))
                .press(PointOption.point(1030,995))
                .moveTo(PointOption.point(19, 991))
                .release()
                .perform();
*/
/*        (new TouchAction(getDriver()))
                .press({x: 1030, y: 995})
                .moveTo({x: 19: y: 991})
                .release()
                .perform();*/
        element(btnToThirdPage).waitUntilClickable().click();
        element(btnClose).waitUntilClickable().click();
    }

}
