package au.com.carsguide.pages;

import au.com.carsguide.utils.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class NewAndUsedCarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement _verifySearchCarsText;
    @FindBy(xpath = "//select[@id='makes']")
    WebElement _anyMakeField;
    @FindBy(xpath = "//select[@id='models']")
    WebElement _anyModelFiled;
    @FindBy(xpath = "//select[@id='locations']")
    WebElement _anyLocationField;
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement _priceMaxField;
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement _findMyNextCarButton;


    //This method will verify that user is on bew and used car search page
    public void verifyUserIsOnNewAndUsedCarSearch() {
        Reporter.log("Verify that user is on new and used car search page " + _verifySearchCarsText.toString() + "<br>");
        log.info("Verify that user is on new and used car search page " + _verifySearchCarsText.toString());
        Assert.assertEquals("New & Used Car Search - carsguide", getTextFromElement(_verifySearchCarsText));
    }

    //This method will select from  any make field and select Brands
    public void selectAnyMakeFieldAndSelectBrand(String brand) {
        Reporter.log("Select any make field and select BMW" + _anyMakeField.toString() + "<br>");
        log.info("Clicking on any make field and select BMW" + _anyMakeField.toString());
        selectByVisibleTextFromDropDown(_anyMakeField,brand);

    }
    //This method will select from any make field and select Brands
    public void selectAnyModelFieldAndSelectModel(String model) {
        Reporter.log("Select any model field and select series" + _anyModelFiled.toString() + "<br>");
        log.info("Clicking on any model field and select series" + _anyModelFiled.toString());
        selectByVisibleTextFromDropDown(_anyModelFiled,model);

    }
    //This method will select from any location field and select location
    public void selectAnyLocationAndSelectLocation(String location) {
        Reporter.log("Select any location field and select location" + _anyLocationField.toString() + "<br>");
        log.info("Select any location field and select location" + _anyLocationField.toString());
        selectByVisibleTextFromDropDown(_anyLocationField,location);

    }
    //This method will select from any location field and select location
    public void selectPriceMaxFieldAndSelectPrice(String price) {
        Reporter.log("Select price max field and select price" + _priceMaxField.toString() + "<br>");
        log.info("Select price max field and select price" + _priceMaxField.toString());
        selectByVisibleTextFromDropDown(_priceMaxField,price);

    }
    //This method will click on find my next car field
    public void clickOnFindMyNextCarButton(){
        Reporter.log("clicking on find my next car button"+_findMyNextCarButton.toString()+"<br>");
        log.info("clicking on find my next car button"+_findMyNextCarButton.toString());
        clickOnElement(_findMyNextCarButton);
    }
}
