
	package stepdefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.SubscriptionPage;

public class SubscriptionSteps {

    private SubscriptionPage subscriptionPage;

    @Given("user is on Hotstar home page")
    public void user_is_on_hotstar_home_page() {

        subscriptionPage = new SubscriptionPage(Hooks.driver);

        Hooks.driver.get("https://www.hotstar.com/in/");
    }

    @When("user clicks My Space")
    public void user_clicks_my_space() {

        subscriptionPage.clickMySpace();
    }

    @And("user clicks Premium")
    public void user_clicks_premium() {

        subscriptionPage.clickPremium();
    }

    @And("user clicks Payment Details")
    public void user_clicks_payment_details() {

        subscriptionPage.clickPaymentDetails();
    }

    @And("user selects subscription plan")
    public void user_selects_subscription_plan() {

        subscriptionPage.clickSubscriptionPlan();
    }

    @And("user clicks Continue")
    public void user_clicks_continue() {

        subscriptionPage.clickContinue();
    }

    @Then("subscription page should be displayed")
    public void subscription_page_should_be_displayed() {

        Assert.assertTrue(
                subscriptionPage.isSubscriptionPageDisplayed(),
                "Subscription page was not displayed"
        );
    }
}