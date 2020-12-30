package au.com.carsguide.stepdefs;

import au.com.carsguide.pages.AudiA4Page;
import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class UsedCarsSearchSaleStepdefs {
    @And("^click on submenu Used Search link$")
    public void clickOnSubmenuUsedSearchLink() {
        new HomePage().clickOnUsedSearchCarsLink();
    }

    @And("^select carMaker \"([^\"]*)\" from AnyMake dropdown$")
    public void selectCarMakerFromAnyMakeDropdown(String brand) {
        new NewAndUsedCarSearchPage().selectAnyMakeFieldAndSelectBrand(brand);
    }

    @And("^select carModel \"([^\"]*)\" from AmyModel dropdown$")
    public void selectCarModelFromAmyModelDropdown(String model)  {
        new NewAndUsedCarSearchPage().selectAnyModelFieldAndSelectModel(model);
    }

    @And("^select location \"([^\"]*)\"  from SelectLocation dropdown$")
    public void selectLocationFromSelectLocationDropdown(String location) {
        new NewAndUsedCarSearchPage().selectAnyLocationAndSelectLocation(location);

    }

    @And("^select price \"([^\"]*)\" from price dropdown$")
    public void selectPriceFromPriceDropdown(String price) {
        new NewAndUsedCarSearchPage().selectPriceMaxFieldAndSelectPrice(price);

    }

    @And("^click on Find_My_Car button$")
    public void clickOnFind_My_CarButton() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarButton();
    }

    @Then("^I should see list of Used cars \"([^\"]*)\"$")
    public void iShouldSeeListOfUsedCars(String text) {
        Assert.assertEquals(text,new AudiA4Page().verifyThatUserNavigateToAudiPageSuccessfully());

    }

    @And("^the page title should match expected title  \"([^\"]*)\"$")
    public void thePageTitleShouldMatchExpectedTitle(String title){
       Assert.assertEquals(title,new AudiA4Page().getAudiPageTitle());
    }
}
