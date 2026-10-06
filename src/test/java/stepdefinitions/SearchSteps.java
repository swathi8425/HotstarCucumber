
package stepdefinitions;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.testng.Assert;

import pages.HomePage;
import pages.SearchPage;

public class SearchSteps {

    HomePage homePage;
    SearchPage searchPage;

    @Given("user opens Hotstar application")
    public void user_opens_hotstar_application() {

        homePage = new HomePage(BaseTest.driver);
        searchPage = new SearchPage(BaseTest.driver);
    }

    @When("user clicks search")
    public void user_clicks_search() {

        homePage.clickSearch();
    }

    @When("user searches for movie {string}")
    public void user_searches_for_movie(String movie) {

        searchPage.searchMovie(movie);
    }

    @Then("search results should be displayed")
    public void search_results_should_be_displayed() {

        Assert.assertTrue(
                searchPage.isSearchResultDisplayed(),
                "Search results are not displayed");
    }
}



