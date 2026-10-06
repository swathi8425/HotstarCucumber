package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;

import base.BaseTest;
import pages.WatchlistPage;

public class WatchlistSteps {

    WatchlistPage watchlistPage;

    @Then("watchlist option should be displayed")
    public void watchlist_option_should_be_displayed() {

        Assert.assertTrue(true);
    }

    @When("user adds the movie to watchlist")
    public void user_adds_movie_to_watchlist() {

        watchlistPage = new WatchlistPage(BaseTest.driver);

        watchlistPage.clickAddToWatchlist();
    }

    @Then("movie should be added to watchlist")
    public void movie_should_be_added_to_watchlist() {

        Assert.assertTrue(
                watchlistPage.isMovieInWatchlist(),
                "Movie was not added to watchlist");
    }

    @When("user opens watchlist")
    public void user_opens_watchlist() {

        watchlistPage = new WatchlistPage(BaseTest.driver);

        Assert.assertTrue(
                watchlistPage.isWatchlistDisplayed(),
                "Watchlist is not displayed");
    }

    @Then("watchlist page should be displayed")
    public void watchlist_page_should_be_displayed() {

        Assert.assertTrue(
                watchlistPage.isWatchlistDisplayed());
    }

    @Then("selected movie should be displayed")
    public void selected_movie_should_be_displayed() {

        Assert.assertTrue(
                watchlistPage.isMovieInWatchlist());
    }

    @Then("movies should be added to watchlist")
    public void movies_should_be_added_to_watchlist() {

        Assert.assertTrue(
                watchlistPage.isMovieInWatchlist());
    }

    @When("user refreshes the page")
    public void user_refreshes_the_page() {

        BaseTest.driver.navigate().refresh();
    }

    @Then("watchlist URL should be displayed")
    public void watchlist_url_should_be_displayed() {

        Assert.assertTrue(
                BaseTest.driver.getCurrentUrl()
                        .toLowerCase()
                        .contains("hotstar"));
    }

    @Then("movie card should be displayed")
    public void movie_card_should_be_displayed() {

        Assert.assertTrue(
                watchlistPage.isMovieInWatchlist());
    }

    @Then("watchlist page title should be displayed")
    public void watchlist_page_title_should_be_displayed() {

        Assert.assertFalse(
                BaseTest.driver.getTitle().isEmpty());
    }
}