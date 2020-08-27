package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjs.HomePage;
import pageobjs.LottoPage;
import utilities.BrowserDriver;

import java.util.ArrayList;
import java.util.List;

public class LottoStepDefinition {

    private HomePage hPage;
    private LottoPage lottoPage;
    private List<String> numbers = new ArrayList<>();

    @Before
    public void setupBrowser() {

        final String webAppUrl = System.getProperty("URL");
        //final String webAppUrl = "https://mylotto.co.nz/";
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

    @Given("^I am in the lotto home page$")
    public void iAmInTheLottoHomePage() {
        hPage = new HomePage(BrowserDriver.getDriver());
        Assert.assertTrue(hPage.checkHomePageIsDisplayed(), "Home page is not displayed");
    }

    @And("^I want to pick my own numbers$")
    public void iWantToPickMyOwnNumbers() {
        hPage.clickOnPickYourOwnButton();
    }

    @And("^I should land on the page where numbers can be selected$")
    public void iShouldLandOnThePageWhereNumbersCanBeSelected() {
        lottoPage = new LottoPage(BrowserDriver.getDriver());
        Assert.assertTrue(lottoPage.isLottoSectionDisplayed(), "Lotto number selection page is not displayed");
    }

    @Then("^I should be able to fill the first row by selecting autofill option$")
    public void iShouldBeAbleToFillTheFirstRowBySelectingAutofillOption() {
        lottoPage.clickOnAutoFillButton();
        Assert.assertEquals(lottoPage.getFirstRowNumbersCount(), 6, "Auto fill values are successfully added");
    }

    @And("^I could select the numbers \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" from Lotto section in the left$")
    public void iCouldSelectTheNumbersFromLottoSectionInTheLeft(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
        numbers.add(arg0);
        numbers.add(arg1);
        numbers.add(arg2);
        numbers.add(arg3);
        numbers.add(arg4);
        numbers.add(arg5);
        lottoPage.selectLottoNumbers(numbers);
    }

    @And("^I could select the number \"([^\"]*)\" from Powerball section$")
    public void iCouldSelectTheNumberFromPowerballSection(String powerBallNumber) throws Throwable {
        lottoPage.selectPowerBallNumber(powerBallNumber);
    }

    @And("^I verify that the numbers selected are displayed on the right pane in yellow$")
    public void iVerifyThatTheNumbersSelectedAreDisplayedOnTheRightPaneInYellow() {
        List<String> actualSelectedNumbers = new ArrayList<>();
        List<WebElement> actualSelectedNumbersElementList = lottoPage.getSelectedLottoNumbers();
        actualSelectedNumbersElementList.stream().map(WebElement::getText).forEach(actualSelectedNumbers::add);
        Assert.assertEquals(actualSelectedNumbers, numbers, "Numbers are not selected correctly");
    }
}
