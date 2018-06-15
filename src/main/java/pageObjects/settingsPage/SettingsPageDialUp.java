package pageObjects.settingsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.dzienniki;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SettingsPageDialUp {

    @CacheLookup
    WebElement label_mobile_network_settings;
    @CacheLookup
    SettingsPage settingsPage;
    @CacheLookup
    WebElement dialup;
    @CacheLookup
    WebElement pop_confirm;
    @CacheLookup
    WebElement network_select;
    @CacheLookup
    WebElement mobilensetting_apply;
    @CacheLookup
    WebElement pop_OK;
    @CacheLookup
    @FindBy(how= How.XPATH,using="//*[@id=\"plmn_list\"]//label[text()=\"PLAY LTE\"]")
    WebElement PlayPlmn;
    WebDriverWait waitForMobilenSettingAplly;
    private final static Logger LOGGER = Logger.getLogger(SettingsPageDialUp.class .getName());


    public SettingsPageDialUp(WebDriver driver) {
        settingsPage = PageFactory.initElements(driver, SettingsPage.class);
        settingsPage.clickWLan();
        waitForMobilenSettingAplly = new WebDriverWait(driver, 30);
    }

    public void NetworkSelectMode(int flag){
        Select select_network = new Select(network_select);
        select_network.selectByIndex(flag);
    }

    public void ClickUstawieniaSieci(){
        dialup.click();
        label_mobile_network_settings.click();
    }

    public void selectPlayPlmn(){
        PlayPlmn.click();
        pop_OK.click();
    }

    public void applyChanges() throws InterruptedException {
        LOGGER.setLevel(Level.INFO);
        LOGGER.info("hello1");
//        WebElement element = waitForMobilenSettingAplly.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mobilensetting_apply\"]/span/span/span")));
        LOGGER.info("hello2");
//        System.out.println(element.isEnabled());

//        if (element.isDisplayed()) ;
        for (int a = 0; a < 10; a++) {
            try {
                mobilensetting_apply.click();
                break;
            } catch (Exception e) {
                LOGGER.info("exception trying mobilensetting");
            }

            TimeUnit.SECONDS.sleep(1);
        }
        LOGGER.info("hello2");
//        mobilensetting_apply.click();
        pop_confirm.click();
        LOGGER.info("hello3");
    }
}
