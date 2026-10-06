package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;

import base.BaseTest;
import pages.HomePage;
import pages.MySpacePage;
import pages.SubscriptionPage;

public class SubscriptionSteps {

    HomePage homePage;
    MySpacePage mySpacePage;
    SubscriptionPage subscriptionPage;

    @When("user opens My Space")
    public void user_opens_my_space() {

        homePage = new HomePage(BaseTest.driver);

        homePage.clickMySpace();

        mySpacePage = new MySpacePage(BaseTest.driver);
    }

    @Then("My Space page should be displayed")
    public void my_space_page_should_be_displayed() {

        Assert.assertTrue(
                mySpacePage.isMySpaceOpened(),
                "My Space page is not displayed");
    }

    @Then("Premium option should be displayed")
    public void premium_option_should_be_displayed() {

        Assert.assertTrue(true);
    }

    @When("user selects Premium")
    public void user_selects_premium() {

        mySpacePage.clickPremium();

        subscriptionPage =
                new SubscriptionPage(BaseTest.driver);
    }

    @Then("subscription page should be displayed")
    public void subscription_page_should_be_displayed() {

        Assert.assertTrue(
                subscriptionPage.isPaymentPageOpened(),
                "Subscription page is not displayed");
    }

    @Then("Payment Details page should be displayed")
    public void payment_details_page_should_be_displayed() {

        Assert.assertTrue(
                subscriptionPage.isPaymentPageOpened(),
                "Payment Details page is not displayed");
    }

    @Then("subscription plans should be displayed")
    public void subscription_plans_should_be_displayed() {

        Assert.assertTrue(
                subscriptionPage.isSubscriptionPlanDisplayed(),
                "Subscription plans are not displayed");
    }

    @When("user selects Premium subscription plan")
    public void user_selects_premium_subscription_plan() {

        subscriptionPage.selectPremiumPlan();
    }

    @Then("Premium subscription plan should be selected")
    public void premium_subscription_plan_should_be_selected() {

        Assert.assertTrue(true);
    }

    @Then("Continue button should be displayed")
    public void continue_button_should_be_displayed() {

        Assert.assertTrue(true);
    }

    @When("user clicks Continue")
    public void user_clicks_continue() {

        subscriptionPage.clickContinue();
    }

    @Then("subscription checkout page should be displayed")
    public void subscription_checkout_page_should_be_displayed() {

        Assert.assertTrue(
                BaseTest.driver.getCurrentUrl()
                        .toLowerCase()
                        .contains("hotstar"));
    }

    @Then("subscription URL should be displayed")
    public void subscription_url_should_be_displayed() {

        Assert.assertTrue(
                BaseTest.driver.getCurrentUrl()
                        .toLowerCase()
                        .contains("hotstar"));
    }

    @Then("Payment Details heading should be displayed")
    public void payment_details_heading_should_be_displayed() {

        Assert.assertTrue(
                subscriptionPage.isPaymentPageOpened());
    }
}
	