package pageObjects.settingsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.dzienniki;

import java.util.logging.Logger;

public class SettingsPageWlan {
    private final static Logger LOGGER = Logger.getLogger(dzienniki.class .getName());
//    @CacheLookup
    WebElement wlanmacfilter;
    @CacheLookup
    SettingsPage settingsPage;
//    @CacheLookup
    WebElement ssid1_select_service;
    @CacheLookup
    WebElement ssid1_input_WifiMacFilterMac0;
//    @CacheLookup
    WebElement apply;
//    @CacheLookup
    WebElement pop_confirm;

    public SettingsPageWlan(WebDriver driver) {
        settingsPage = PageFactory.initElements(driver, SettingsPage.class);
        LOGGER.info("SettingPage initialised");
        settingsPage.clickWLan();
        LOGGER.info("Clicked WLan");
    }

    public void MacFilterFlag(int flag){
        Select select_Mac_politic = new Select(ssid1_select_service);
        select_Mac_politic.selectByIndex(flag);
        LOGGER.info("mac filter flag tuned");
    }
    public void clickWlanMacFilter(){
        wlanmacfilter.click();
        LOGGER.info("wlanmacfilter.click()");
    }

    public void insertMacadress(String macAdress){
        ssid1_input_WifiMacFilterMac0.clear();
        ssid1_input_WifiMacFilterMac0.sendKeys(macAdress);
    }

    public void applyChanges(){
        apply.click();
        pop_confirm.click();
    }
}
