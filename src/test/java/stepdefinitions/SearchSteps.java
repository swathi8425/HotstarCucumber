
	package stepdefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import pages.SearchPage;

public class SearchSteps {

    SearchPage searchPage;

    @Given("I am on the Hotstar home page")
    public void i_am_on_the_hotstar_home_page() {

        Hooks.driver.get("https://www.hotstar.com/in");

        searchPage = new SearchPage(Hooks.driver);
    }

    @When("I click on the search icon")
    public void i_click_on_the_search_icon() {

        searchPage.clickSearchIcon();
    }

    @When("I enter {string} in the search box")
    public void i_enter_in_the_search_box(String movie) {

        searchPage.enterSearchText(movie);
    }

    @Then("search results should be displayed")
    public void search_results_should_be_displayed() {

        Assert.assertTrue(
            searchPage.isSearchResultDisplayed(),
            "Search results were not displayed"
        );
    }

    @Then("no relevant search result should be displayed")
    public void no_relevant_search_result_should_be_displayed() {

        Assert.assertTrue(
            searchPage.isSearchPageDisplayed(),
            "Search page was not displayed"
        );
    }
}