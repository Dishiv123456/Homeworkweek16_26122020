package au.com.carsguide.testsuite;

import au.com.carsguide.pages.*;
import au.com.carsguide.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

public class UsedSearchCarTest extends TestBase {
    HomePage homePage;
    NewAndUsedCarSearchPage newAndUsedCarSearchPage;
    BMW1SeriesPage bmw1SeriesPage;
    UsedCarSearchPage usedCarSearchPage;
    AudiA4Page audiA4Page;

    @BeforeMethod(groups = {"smoke", "sanity", "regression"})
    public void setUp() {
        homePage = new HomePage();
        newAndUsedCarSearchPage = new NewAndUsedCarSearchPage();
        bmw1SeriesPage = new BMW1SeriesPage();
        usedCarSearchPage = new UsedCarSearchPage();
        audiA4Page = new AudiA4Page();
    }

    @Test(groups = {"sanity", "regression"})
    public void validateUsedSearchCarsPage() {
        homePage.mouseHoverToBuySellLink();
        homePage.clickOnUsedSearchCarsLink();
        usedCarSearchPage.verifyThatUserIsOnUsedCarsPage();
        newAndUsedCarSearchPage.selectAnyMakeFieldAndSelectBrand("Audi");
        newAndUsedCarSearchPage.selectAnyModelFieldAndSelectModel("A4");
        newAndUsedCarSearchPage.selectAnyLocationAndSelectLocation("SA - All");
        newAndUsedCarSearchPage.selectPriceMaxFieldAndSelectPrice("$20,000");
        newAndUsedCarSearchPage.clickOnFindMyNextCarButton();
        audiA4Page.verifyThatUserNavigateToAudiPageSuccessfully();
        audiA4Page.getTitle();


    }

}
