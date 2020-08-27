package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserDriver;

public class BaseTest {

    @Before
    public void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        BrowserDriver.setDriver(new ChromeDriver());
    }


    @After
    public void tearDown() {
        BrowserDriver.getDriver().quit();
    }

}
