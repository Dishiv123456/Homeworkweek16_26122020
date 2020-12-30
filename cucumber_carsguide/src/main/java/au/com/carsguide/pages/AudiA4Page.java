package au.com.carsguide.pages;

import au.com.carsguide.utils.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;



public class AudiA4Page extends Utility {
    private static final Logger log = LogManager.getLogger(AudiA4Page.class.getName());

    @FindBy(xpath = "//*[@id=\"all-tab-content\"]/div/div[3]/h1")
    WebElement _verifyAudiPageText;

    //This method will get text and verify that user is on Audi page

    public String verifyThatUserNavigateToAudiPageSuccessfully(){
        Reporter.addStepLog("Verify user navigate to Audi A4 page"+_verifyAudiPageText.toString()+"<br>");
        log.info("Verify user navigate to Audi A4 page"+_verifyAudiPageText.toString());
       return getTextFromElement(_verifyAudiPageText);

    }
    //This Method will get Title of the page

    public String  getAudiPageTitle(){
        return  driver.getTitle();
    }



}
