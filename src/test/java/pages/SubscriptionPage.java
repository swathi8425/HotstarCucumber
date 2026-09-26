
	package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubscriptionPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public SubscriptionPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    // My Space
    private By mySpace = By.xpath(
            "//*[normalize-space()='My Space']"
    );

    // Premium option
    private By premium =  By.xpath("//span[contains(@class,'SUBSCRIBED_PLAN_COLOR')]");

    // Payment details
    private By paymentDetails = By.xpath("//span[contains(normalize-space(),'Payment Details')]");
            
    

    // Subscription / plan
    private By subscriptionPlan = By.xpath("//span[normalize-space()='Premium 3 Months']" );

    // Continue button
    private By continueButton = By.xpath(
            "//button[normalize-space()='Continue' ");

    public void clickMySpace() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(mySpace)
        );

        element.click();
    }

    public void clickPremium() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(premium)
        );

        element.click();
    }

    public void clickPaymentDetails() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(paymentDetails)
        );

        element.click();
    }

    public void clickSubscriptionPlan() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(subscriptionPlan)
        );

        element.click();
    }

    public void clickContinue() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(continueButton)
        );

        element.click();
    }

    public boolean isSubscriptionPageDisplayed() {

        try {

            wait.until(ExpectedConditions.or(
                    ExpectedConditions.urlContains("subscription"),
                    ExpectedConditions.urlContains("subscribe"),
                    ExpectedConditions.urlContains("payment"),
                    ExpectedConditions.presenceOfElementLocated(subscriptionPlan)
            ));

            return true;

        } catch (Exception e) {

            System.out.println(
                    "Subscription page was not detected."
            );

            System.out.println(
                    "Current URL: " + driver.getCurrentUrl()
            );

            System.out.println(
                    "Current Title: " + driver.getTitle()
            );

            return false;
        }
    }
}