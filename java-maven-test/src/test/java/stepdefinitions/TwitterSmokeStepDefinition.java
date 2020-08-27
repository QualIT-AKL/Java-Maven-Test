/*
package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjs.HomePage;
import pageobjs.LoginPage;
import pageobjs.TwitterUserHomePage;
import utilities.BrowserDriver;

public class TwitterSmokeStepDefinition {

    private Scenario scenario;
    HomePage hPage;
    LoginPage loginP;
    TwitterUserHomePage twitterHome;

    @Before
    public void setupBrowser(Scenario scenario) {
        this.scenario = scenario;
        //final String webAppUrl = System.getProperty("URL");
        final String webAppUrl = "https://twitter.com/";
        // System.out.println("\"" + System.getProperty("timestamp") + "\"");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        // set the driver based on property above
        BrowserDriver.setDriver(new ChromeDriver());
        BrowserDriver.getDriver().get(webAppUrl);
    }

    @After
    public void tearDown() {
        BrowserDriver.getDriver().quit();
    }

    @Given("I am in the twitter home page")
    public void i_am_on_Twitter_website() {
        hPage = new HomePage(BrowserDriver.getDriver());
        hPage.goToLoginPage();
    }

    @Given("^login as \"([^\"]*)\" with password \"([^\"]*)\"$")
    public void loginAsGiven(String uName, String pWord) {
        loginP = new LoginPage(BrowserDriver.getDriver());
        loginP.loginWithCredentials(uName, pWord);
        //BrowserDriver.getDriver().findElement(By.xpath("(//button[contains(@type,'submit')])[1]")).click();
    }

    @Then("^I should land on my personal landing page \"([^\"]*)\"$")
    public void verifyUserLandingPage(String fullName) throws Exception {
        twitterHome = new TwitterUserHomePage(BrowserDriver.getDriver());
        Assert.assertEquals(fullName, twitterHome.getDashboardProfileName(), "Profile name doesn't match");
    }

    @And("^I verify profile ID \"([^\"]*)\"$")
    public void iVerifyProfileID(String expectedProfileID) throws Throwable {
        Assert.assertEquals(expectedProfileID, twitterHome.getProfileID(), "Profile ID doesn't match");
    }

    @And("^I logout from twitter account$")
    public void iLogoutFromTwitterAccount() {
        twitterHome.logoutTwitter();
        Assert.assertTrue(loginP.isPhoneEmailFieldDisplayed());
    }
}
*/
