package au.com.carsguide.testbase;

import au.com.carsguide.propertyreader.PropertyReader;
import au.com.carsguide.utils.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase extends Utility {


    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod (groups = {"smoke,sanity,regression"})
    public void openBrowser() {
        selectBrowser(browser);
    }

    @AfterMethod(groups = {"smoke,sanity,regression"})
    public void tearDown() {
        closeBrowser();
    }

}
