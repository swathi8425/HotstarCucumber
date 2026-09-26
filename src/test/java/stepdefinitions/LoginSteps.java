package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import pages.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("I open Hotstar website")
    public void i_open_hotstar_website() {

        driver = Hooks.driver;

        driver.get("https://www.hotstar.com/in");

        driver.manage().window().maximize();
    }

    @When("I click on the Log In button")
    public void i_click_on_the_log_in_button() {

        loginPage = new LoginPage(driver);

        loginPage.clickLogin();
    }

    @Then("I should see the login page")
    public void i_should_see_the_login_page() {

        Assert.assertTrue(
            driver.getCurrentUrl().contains("hotstar"),
            "Login page was not opened"
        );
    }
}