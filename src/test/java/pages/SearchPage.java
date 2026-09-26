package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    WebDriver driver;
    WebDriverWait wait;

    private By searchIcon = By.xpath(
        "//*[contains(@aria-label,'Search') " +
        "or contains(@title,'Search')]"
    );

    private By searchBox = By.xpath(
        "//input[@type='search' " +
        "or contains(translate(@placeholder,'SEARCH','search'),'search')]"
    );

    public SearchPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
            driver,
            Duration.ofSeconds(20)
        );
    }

    public void clickSearchIcon() {

        WebElement search = wait.until(
            ExpectedConditions.visibilityOfElementLocated(searchIcon)
        );

        search.click();
    }

    public void enterSearchText(String movieName) {

        WebElement search = wait.until(
            ExpectedConditions.visibilityOfElementLocated(searchBox)
        );

        search.clear();
        search.sendKeys(movieName);
        search.sendKeys(Keys.ENTER);
    }

    public boolean isSearchResultDisplayed() {

        try {

            return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.xpath(
                        "//*[contains(text(),'Pushpa')]"
                    )
                )
            ).isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }

    public boolean isSearchPageDisplayed() {

        return driver.getCurrentUrl().contains("hotstar");
    }
}
