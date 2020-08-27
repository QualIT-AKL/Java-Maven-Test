package pageobjs;

import common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LottoPage extends BasePage {
    private WebDriver driver;

    private String lottoSection = "//div[@id='lottoSection']";
    private String autoFillButton = "//div[@id='lottoSection']//div[@class='autoFillButton']";
    private String autoSelectedNumbers = "//div[@class='line lineIsNotInEdit']/div";
    private String selectLottoNumber = "//div[@id='lottoNumberSelector']//div[@id='lottoNumber$$']";
    private String selectPowerBallNumber = "//div[@id='powerballNumberSelector']//div[@id='powerballNumber$$']";
    private String selectedNumbers = "//span[@id='letterB']/../div[@class='line lineIsNotInEdit']/div";

    public LottoPage(final WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isLottoSectionDisplayed() {
        return findByXPath(lottoSection).isDisplayed();
    }

    public void clickOnAutoFillButton() {
        findByXPath(autoFillButton).click();
    }

    public int getFirstRowNumbersCount() {
        return findElementsByXpath(autoSelectedNumbers).size();
    }

    public void selectLottoNumbers(List<String> numbers) {
        for (String number : numbers) {
            findByXPath(generateLottoXpath(number)).click();
        }
    }

    public void selectPowerBallNumber(String number) {
        findByXPath(selectPowerBallNumber.replace("$$", number)).click();
    }

    private String generateLottoXpath(String number) {
        return selectLottoNumber.replace("$$", number);
    }

    public List<WebElement> getSelectedLottoNumbers() {
        return findElementsByXpath(selectedNumbers);
    }


}
