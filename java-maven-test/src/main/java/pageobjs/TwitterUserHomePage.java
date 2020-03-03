package pageobjs;

import common.BasePage;
import org.openqa.selenium.WebDriver;

public class TwitterUserHomePage extends BasePage {

    private String profileButton = "//span[contains(text(),'Profile')]";
    private String dashboardProfileNameLoc = "//span[contains(text(),'John Doe')]";

    public TwitterUserHomePage(WebDriver driver) {
        super(driver);
    }

    public String getDashboardProfileName() {

        findByXPath(profileButton).click();
        String profileName = findByXPath(dashboardProfileNameLoc).getText();
        return profileName;
    }
}
