package au.com.carsguide.pages;

import au.com.carsguide.utils.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement _buySellLink;
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement _searchCarsLink;
    @FindBy(xpath = "//*[@id=\"u_H\"]/div/div[1]/ul/li[1]//div[1]/ul/li[2]/a")
    WebElement _usedSearchLink;


    //This method will mouse hover to buy sell link
    public void mouseHoverToBuySellLink() {
        Reporter.addStepLog("This will mouse on buy sell link" + _buySellLink.toString() + "<br>)");
        log.info("This will mouse on buy sell link" + _buySellLink.toString());
        mouseHoverToElement(_buySellLink);
    }

    //This method will click on search cars link
    public void clickOnSearchCarsLink() {
        Reporter.addStepLog("This will click on search cars link" + _searchCarsLink.toString() + "<br>)");
        log.info("This will click on search cars link" + _searchCarsLink.toString());
        clickOnElement(_searchCarsLink);
    }
//This method will click on Used search cars link
    public void clickOnUsedSearchCarsLink() {
        Reporter.addStepLog("This will click on used search cars link" + _usedSearchLink.toString() + "<br>)");
        log.info("This will click on used search cars link" + _usedSearchLink.toString());
        clickOnElement(_usedSearchLink);
    }

}
