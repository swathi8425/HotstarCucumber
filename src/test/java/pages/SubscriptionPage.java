
	package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubscriptionPage {

    WebDriver driver;
    WebDriverWait wait;

    public SubscriptionPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(20));
    }

    private By paymentDetails =
            By.xpath("//*[normalize-space()='Payment Details']");

    private By subscriptionPlan =
            By.xpath("//*[contains(normalize-space(),'Subscription Plan')]");

    private By premiumPlan =
            By.cssSelector("[id*='plan-card']");

    private By continueButton =
            By.xpath("//*[normalize-space()='Continue']");

    public boolean isPaymentPageOpened() {

        try {

            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            paymentDetails))
                    .isDisplayed();

        } catch (Exception e) {

            return driver.getCurrentUrl()
                    .toLowerCase()
                    .contains("payment");
        }
    }

    public boolean isSubscriptionPlanDisplayed() {

        try {

            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            subscriptionPlan))
                    .isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }

    public void selectPremiumPlan() {

        wait.until(
                ExpectedConditions.elementToBeClickable(premiumPlan))
                .click();
    }

    public void clickContinue() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        continueButton))
                .click();
    }
}