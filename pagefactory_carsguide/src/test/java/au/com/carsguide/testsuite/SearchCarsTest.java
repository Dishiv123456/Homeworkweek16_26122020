package au.com.carsguide.testsuite;

import au.com.carsguide.pages.BMW1SeriesPage;
import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import au.com.carsguide.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchCarsTest extends TestBase {
    HomePage homePage;
    NewAndUsedCarSearchPage newAndUsedCarSearchPage;
    BMW1SeriesPage bmw1SeriesPage;

    @BeforeMethod(groups = {"smoke", "sanity", "regression"})
    public void setUp() {
        homePage = new HomePage();
        newAndUsedCarSearchPage = new NewAndUsedCarSearchPage();
        bmw1SeriesPage = new BMW1SeriesPage();
    }

    @Test(groups = {"smoke", "regression"})
    public void validateSearchCarsPage() {
        homePage.mouseHoverToBuySellLink();
        homePage.clickOnSearchCarsLink();
        newAndUsedCarSearchPage.verifyUserIsOnNewAndUsedCarSearch();
        newAndUsedCarSearchPage.selectAnyMakeFieldAndSelectBrand("BMW");
        newAndUsedCarSearchPage.selectAnyModelFieldAndSelectModel("1 Series");
        newAndUsedCarSearchPage.selectAnyLocationAndSelectLocation("NSW - Sydney");
        newAndUsedCarSearchPage.selectPriceMaxFieldAndSelectPrice("$30,000");
        newAndUsedCarSearchPage.clickOnFindMyNextCarButton();
        bmw1SeriesPage.UserShouldNavigateToBMW1SeriesPage();
        bmw1SeriesPage.getTitle();

    }
}
