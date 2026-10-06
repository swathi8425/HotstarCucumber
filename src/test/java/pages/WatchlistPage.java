
	package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WatchlistPage {

    WebDriver driver;
    WebDriverWait wait;

    public WatchlistPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    private By addToWatchlist = By.xpath(
            "//*[contains(translate(normalize-space(.),"
            + "'ABCDEFGHIJKLMNOPQRSTUVWXYZ',"
            + "'abcdefghijklmnopqrstuvwxyz'),'watchlist')]");

    private By watchlist = By.xpath(
            "//*[contains(normalize-space(.),'Watchlist')]");

    private By movieCard = By.cssSelector(
            "[class*='card'], [class*='Card']");

    public void clickAddToWatchlist() {

        wait.until(
                ExpectedConditions.elementToBeClickable(addToWatchlist))
                .click();
    }

    public boolean isWatchlistDisplayed() {

        try {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(watchlist))
                    .isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }

    public boolean isMovieInWatchlist() {

        try {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(movieCard))
                    .isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }
}