
	package stepdefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

import pages.SearchPage;
import pages.WatchlistPage;

public class WatchlistSteps {

    SearchPage searchPage;
    WatchlistPage watchlistPage;

    @When("I search for {string}")
    public void i_search_for(String movie) {

        searchPage = new SearchPage(Hooks.driver);

        searchPage.clickSearchIcon();
        searchPage.enterSearchText(movie);
    }

    @When("I select a movie from the search results")
    public void i_select_a_movie_from_the_search_results() {

        // Replace with the actual movie locator.
        // Example:
        // By movie = By.xpath("//*[contains(text(),'Pushpa')]");

    }

    @When("I click the Add to Watchlist button")
    public void i_click_the_add_to_watchlist_button() {

        watchlistPage = new WatchlistPage(Hooks.driver);

        watchlistPage.clickAddToWatchlist();
    }

    @Then("the movie should be added to my watchlist")
    public void the_movie_should_be_added_to_my_watchlist() {

        Assert.assertTrue(
            watchlistPage.isWatchlistDisplayed(),
            "Watchlist was not displayed"
        );
    }

    @When("I click My Space")
    public void i_click_my_space() {

        watchlistPage = new WatchlistPage(Hooks.driver);

        watchlistPage.clickMySpace();
    }

    @Then("My Space page should be displayed")
    public void my_space_page_should_be_displayed() {

        Assert.assertTrue(
            watchlistPage.isWatchlistDisplayed(),
            "My Space page was not displayed"
        );
    }

    @Given("I have added a movie to my watchlist")
    public void i_have_added_a_movie_to_my_watchlist() {

        // Login/session setup can be added here.
    }

    @When("I open My Space")
    public void i_open_my_space() {

        watchlistPage = new WatchlistPage(Hooks.driver);

        watchlistPage.clickMySpace();
    }

    @Then("the movie should be displayed in my watchlist")
    public void the_movie_should_be_displayed_in_my_watchlist() {

        Assert.assertTrue(
            watchlistPage.isWatchlistDisplayed(),
            "Movie was not displayed in watchlist"
        );
    }
}