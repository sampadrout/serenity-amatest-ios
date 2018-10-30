package com.amaserenity.pages;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import com.amaserenity.utils.Swipe;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.webdriver.WebDriverFacade;

import java.io.IOException;


public class TutorialScreen extends PageObject {

    public TutorialScreen (WebDriver driver) {
        super(driver);
    }

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


    public void closeTutorialScreen() throws InterruptedException, IOException {

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


//        swipeFromRightToLeft();

//        Swipe swipe = new Swipe();
//        swipe.swipeFromRightToLeft(driver);
//        swipe.swipeFromRightToLeft(driver);

        element(btnToThirdPage).waitUntilClickable().click();
        element(btnClose).waitUntilClickable().click();
    }

    public void swipeFromRightToLeft() throws InterruptedException, IOException {

        Dimension size = ((AndroidDriver)((WebDriverFacade) getDriver()).getProxiedDriver()).manage().window().getSize();
        int startx = (int) (size.width * 0.70);
        int endx = (int) (size.width * 0.30);
        int starty = size.height / 2;
        String adbCommandForSwipe = "cmd /c adb shell input touchscreen swipe" + startx + "" + starty + "" + endx + "" + starty + " 100";
        Runtime.getRuntime().exec(adbCommandForSwipe);
        Thread.sleep(2000);
    }

}
