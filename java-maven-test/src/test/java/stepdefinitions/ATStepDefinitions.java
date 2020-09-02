package stepdefinitions;

import common.InvalidApplicationState;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectsAT.HomePage;
import pageobjectsAT.LoggedInUserPage;
import pageobjectsAT.LoginPage;

import org.testng.Assert;

import utilities.BrowserDriver;

public class ATStepDefinitions {

    private HomePage hPage;
    private LoginPage lPage;
    private LoggedInUserPage loggedInUserPage;

    @Given("^I am in \"([^\"]*)\"$")
    public void iAmIn(String url) {
        BrowserDriver.getDriver().get(url);
    }

    @When("^I click 'Log in'$")
    public void iClickLogIn() throws InvalidApplicationState {
        hPage = new HomePage(BrowserDriver.getDriver());
        hPage.clickOnLoginButtons();
    }

    @Given("^I am in the AT home page$")
    public void iAmInTheLottoHomePage() {
        Assert.assertTrue(hPage.isUserOnAppHomePage(), "Application has not been launched successfully");
    }

    @And("^login as \"([^\"]*)\" with password \"([^\"]*)\"$")
    public void loginAsWithPassword(String username, String password) throws InvalidApplicationState {
        lPage = new LoginPage(BrowserDriver.getDriver());
        lPage.loginWithCredentials(username, password);
    }

    @Then("^I should encounter log-in error$")
    public void iShouldLandOnMyPersonalLandingPage() throws InvalidApplicationState {
        loggedInUserPage = new LoggedInUserPage(BrowserDriver.getDriver());
        Assert.assertTrue(loggedInUserPage.isLoginFailed(), "Login Failed");
    }

}
