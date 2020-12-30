package au.com.carsguide.stepdefs;

import au.com.carsguide.pages.BMW1SeriesPage;
import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchCarsStepdefs {
    @Given("^I am on the Home Page of CarsGuide Website$")
    public void iAmOnTheHomePageOfCarsGuideWebsite() {
    }

    @When("^I mouse hover to buy\\+sell Menu$")
    public void iMouseHoverToBuySellMenu() {
        new HomePage().mouseHoverToBuySellLink();
    }

    @And("^click on Search Cars link$")
    public void clickOnSearchCarsLink() {
        new HomePage().clickOnSearchCarsLink();

    }

    @And("^select car brand as \"([^\"]*)\" from AnyMake dropdown$")
    public void selectCarBrandAsFromAnyMakeDropdown(String brand){
        new NewAndUsedCarSearchPage().selectAnyMakeFieldAndSelectBrand(brand);
    }

    @And("^select \"([^\"]*)\" as car model$")
    public void selectAsCarModel(String model){
        new NewAndUsedCarSearchPage().selectAnyModelFieldAndSelectModel(model);

    }

    @And("^select location as \"([^\"]*)\" from Select Location dropdown$")
    public void selectLocationAsFromSelectLocationDropdown(String location) {
        new NewAndUsedCarSearchPage().selectAnyLocationAndSelectLocation(location);
    }

    @And("^select \"([^\"]*)\" as price$")
    public void selectAsPrice(String price)  {
        new NewAndUsedCarSearchPage().selectPriceMaxFieldAndSelectPrice(price);

    }

    @And("^click on Find_My_Next_Car button$")
    public void clickOnFind_My_Next_CarButton() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarButton();
    }

    @Then("^I should see list of searched cars \"([^\"]*)\"$")
    public void iShouldSeeListOfSearchedCars(String text) {
        Assert.assertEquals(text,new BMW1SeriesPage().UserShouldNavigateToBMW1SeriesPage());
    }

    @And("^the page title should be \"([^\"]*)\"$")
    public void thePageTitleShouldBe(String title) {
        Assert.assertEquals(title,new BMW1SeriesPage().getTitle());
    }
}
