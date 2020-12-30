package au.com.carsguide.pages;

import au.com.carsguide.utils.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BMW1SeriesPage extends Utility {
    private static final Logger log = LogManager.getLogger(BMW1SeriesPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'21 BMW 1 Series for Sale under $30,000 in Sydney, ')]")
    WebElement _verifyBMWText;

    //This method will verify that user is on BMW 1 series page
    public String UserShouldNavigateToBMW1SeriesPage() {
        Reporter.addStepLog("verify that user is on BMW 1 series page" + _verifyBMWText.toString() + "<br>");
        log.info("verify that user is on BMW 1 series page" + _verifyBMWText.toString());
       // String actualMessage="21 BMW 1 Series for Sale under $30,000 in Sydney, NSW";
         return getTextFromElement(_verifyBMWText);

    }
    //This method will get title of the page
    public String getTitle() {
        return driver.getTitle();

    }
}
