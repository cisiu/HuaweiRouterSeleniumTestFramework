package pageObjects.settingsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SettingsPageWlan {
    private final static Logger LOGGER = Logger.getLogger(SettingsPageWlan.class .getName());
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
    WebDriverWait clickWlanMacFilterWait;

    public SettingsPageWlan(WebDriver driver) {
        settingsPage = PageFactory.initElements(driver, SettingsPage.class);
        LOGGER.info("SettingPage initialised");
        settingsPage.clickWLan();
        LOGGER.info("Clicked WLan");
        clickWlanMacFilterWait = new WebDriverWait(driver, 5);
    }

    public void MacFilterFlag(int flag){
        LOGGER.info("mac filter flag tuned");
        Select select_Mac_politic = new Select(ssid1_select_service);
        select_Mac_politic.selectByIndex(flag);
    }
    public void clickWlanMacFilter(){
        LOGGER.info("wlanmacfilter.click()");
//        WebElement element = clickWlanMacFilterWait.until(ExpectedConditions.elementToBeClickable(By.id("wlanmacfilter")));
        System.out.println(wlanmacfilter.isEnabled());
//        element.click();
//        wlanmacfilter.click();
        for (int a = 0; a < 10; a++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                wlanmacfilter.click();
                break;
            } catch (Exception e) {
//                LOGGER.info("exception trying mobilensetting");
                LOGGER.log(Level.SEVERE, e.getMessage(), e);
            }

        }
    }

    public void insertMacadress(String macAdress){
        ssid1_input_WifiMacFilterMac0.clear();
        ssid1_input_WifiMacFilterMac0.sendKeys(macAdress);
        LOGGER.info("mac address provided");
    }

    
    public void applyChanges(){
        apply.click();
        pop_confirm.click();
        LOGGER.info("applyChanges");
    }
}
