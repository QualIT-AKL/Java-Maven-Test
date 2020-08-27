package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserDriver;

public class Hooks {

    @Before
    public void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // set the driver based on property above
        BrowserDriver.setDriver(new ChromeDriver());
    }


    @After
    public void tearDown() {
        BrowserDriver.getDriver().quit();
    }

}
