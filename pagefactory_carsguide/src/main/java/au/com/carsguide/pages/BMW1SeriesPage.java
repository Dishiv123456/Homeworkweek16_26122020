package au.com.carsguide.pages;

import au.com.carsguide.utils.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class BMW1SeriesPage extends Utility {
    private static final Logger log = LogManager.getLogger(BMW1SeriesPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'21 BMW 1 Series for Sale under $30,000 in Sydney, ')]")
    WebElement _verifyBMWText;

    //This method will verify that user is on BMW 1 series page
    public void UserShouldNavigateToBMW1SeriesPage() {
        Reporter.log("verify that user is on BMW 1 series page" + _verifyBMWText.toString() + "<br>");
        log.info("verify that user is on BMW 1 series page" + _verifyBMWText.toString());
        Assert.assertEquals("21 BMW 1 Series for Sale under $30,000 in Sydney, NSW", getTextFromElement(_verifyBMWText));

    }
    //This method will get title of the page
    public void getTitle() {

        String actual = "Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide";
        String expected =driver.getTitle();
        Assert.assertEquals(actual,expected);


    }
}
