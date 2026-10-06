package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    WebDriver driver;
    WebDriverWait wait;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    private By searchInput = By.cssSelector(
            "input[type='search'], " +
            "input[placeholder*='Search'], " +
            "input[aria-label*='Search']");

    private By searchResult = By.cssSelector(
            "[class*='search-result'], " +
            "[class*='SearchResult']");

    private By movieCard = By.cssSelector(
            "[class*='card'], [class*='Card']");

    public boolean isSearchPageOpened() {

        try {
            wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchInput));

            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public void searchMovie(String movieName) {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchInput))
                .sendKeys(movieName);

        driver.findElement(searchInput)
                .sendKeys(Keys.ENTER);
    }

    public boolean isSearchResultDisplayed() {

        try {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(movieCard))
                    .isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }

    public boolean isNoResultDisplayed() {

        try {

            return driver.getPageSource()
                    .toLowerCase()
                    .contains("no results");

        } catch (Exception e) {
            return false;
        }
    }
}