
	package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    private By searchButton =
            By.cssSelector("[aria-label*='Search'], [title*='Search']");

    private By mySpace =
            By.xpath("//*[normalize-space()='My Space']");

    private By loginButton =
            By.xpath("//*[normalize-space()='Log In']");

    public boolean isHomePageOpened() {

        return driver.getCurrentUrl().contains("hotstar");
    }

    public boolean isLoginDisplayed() {

        try {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(loginButton))
                    .isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickSearch() {

        wait.until(
                ExpectedConditions.elementToBeClickable(searchButton))
                .click();
    }

    public void clickMySpace() {

        wait.until(
                ExpectedConditions.elementToBeClickable(mySpace))
                .click();
    }
}