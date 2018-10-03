package stepdefinitions;

import org.testng.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.en.*;
import cucumber.api.java.*;
import pageobjs.HomePage;
import pageobjs.LoginPage;
import pageobjs.TwitterUserHomePage;
import utilities.BrowserDriver;

public class ATStepSefintion 
{
	HomePage hPage;
	LoginPage loginP;
	
	@Given("I am in \"(.*)\"")
	public void I_am_in_(String addr) {
		BrowserDriver.getDriver().get(addr);
		BrowserDriver.getDriver().manage().window().maximize();
	}
	
	@When("I click \"Log in\"")
	public void I_click_log_in()
	{
		hPage = new HomePage(BrowserDriver.getDriver());
		hPage.goToLoginPageAT();
	}
	
	
	@When("^now login as \"([^\"]*)\" with password \"([^\"]*)\"$")
	public void whenloginAsGiven(String uName, String pWord) {
		loginP = new LoginPage(BrowserDriver.getDriver());
		loginP.loginWithCredAT(uName, pWord);
	}
	
	@Then("I should receive an login error message")
	public void ThenIshouldReceiveError()
	{
		Assert.assertTrue(loginP.isErrorMsgDisplayed());
	}
}
