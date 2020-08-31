/**
 * 
 */
package stepdefinitions;

import common.InvalidApplicationState;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectsAuckTransport.HomePage;
import pageobjectsAuckTransport.LoginPage;

import org.testng.Assert;

import utilities.BrowserDriver;

/**
 * @author jey.alagumuthu
 *
 */
public class AuckTransportStepDefintions {
	
	    private HomePage homPage;
	    private LoginPage lognPage;

	    @Given("^I am auckland in \"([^\"]*)\"$")
	    public void imIn(String url) {
	        BrowserDriver.getDriver().get(url);
	    }

	    @When("^I click a 'Log in''$")
	    public void clickLogInButton() throws InvalidApplicationState {
	    	homPage = new HomePage(BrowserDriver.getDriver());
	    	homPage.clickOnLoginButtons();
	    }

	    @And("^login good as \"([^\"]*)\" with password \"([^\"]*)\"$")
	    public void loginWithPassword(String username, String password) throws InvalidApplicationState {
	    	lognPage = new LoginPage(BrowserDriver.getDriver());
	    	lognPage.loginWithCredentials(username, password);
	    }


}
