
	package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WatchlistPage {

    WebDriver driver;
    WebDriverWait wait;

    private By mySpace = By.xpath(
        "//*[normalize-space()='My Space']"
    );

    private By watchlist = By.xpath(
        "//*[contains(normalize-space(),'Watchlist')]"
    );

    private By addToWatchlist = By.xpath(
        "//*[contains(@aria-label,'Watchlist') " +
        "or contains(@title,'Watchlist') " +
        "or contains(normalize-space(),'Add to Watchlist')]"
    );

    public WatchlistPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void clickMySpace() {

        WebElement element = wait.until(
            ExpectedConditions.elementToBeClickable(mySpace)
        );

        element.click();
    }

    public void clickAddToWatchlist() {

        WebElement element = wait.until(
            ExpectedConditions.elementToBeClickable(addToWatchlist)
        );

        element.click();
    }

    public boolean isWatchlistDisplayed() {

        try {
            WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(watchlist)
            );

            return element.isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }
}