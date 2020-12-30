package au.com.carsguide.pages;

import au.com.carsguide.utils.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class AudiA4Page extends Utility {
    private static final Logger log = LogManager.getLogger(AudiA4Page.class.getName());

    @FindBy(xpath = "//*[@id=\"all-tab-content\"]/div/div[3]/h1")
    WebElement _verifyAudiPageText;

    //This method will get text and verify that user is on Audi page

    public void verifyThatUserNavigateToAudiPageSuccessfully(){
        Reporter.log("Verify user navigate to Audi A4 page"+_verifyAudiPageText.toString()+"<br>");
        log.info("Verify user navigate to Audi A4 page"+_verifyAudiPageText.toString());
        Assert.assertEquals("10 Used Audi A4s for Sale under $20,000 in SA",getTextFromElement(_verifyAudiPageText));

    }
    //This Method will get Title of the page

    public void  getTitle(){
        String actual = "Used Audi A4 Under 20000 for Sale SA | carsguide";
        String expected =driver.getTitle();
        Assert.assertEquals(actual,expected);

    }



}
