package au.com.carsguide.pages;

import au.com.carsguide.utils.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class UsedCarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarSearchPage.class.getName());


    @FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement _verifyUsedCarText;

    //This method will get text and verify that user is on Used cars page

    public void verifyThatUserIsOnUsedCarsPage(){
        Reporter.log("verify that used is on used cars page"+_verifyUsedCarText.toString()+"<br>");
        log.info("verify that used is on used cars page"+_verifyUsedCarText.toString());
        Assert.assertEquals("Used Cars For Sale",getTextFromElement(_verifyUsedCarText));
    }

}
