
	package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    private By loginButton =
    		 By.xpath(
    			        "//span[normalize-space()='Log In']/ancestor::*[@role='button'][1]");

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
            driver,
            Duration.ofSeconds(20)
        );
    }

    public void clickLogin() {

        WebElement login =
            wait.until(
                ExpectedConditions.elementToBeClickable(loginButton)
            );

        login.click();
    }
}