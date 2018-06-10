package pageObjects.settingsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SettingsPageWlan extends SettingsPage{

    WebElement wlanmacfilter;
    SettingsPage wlanPage;
    WebElement ssid1_select_service;
    WebElement ssid1_input_WifiMacFilterMac0;
    WebElement apply;

    public SettingsPageWlan(WebDriver driver) {
        super(driver);
//        super.clickWLan();
        wlanPage = PageFactory.initElements(driver, SettingsPage.class);
        wlanPage.wlan.click();
    }

    public void MacFilterFlag(int flag){
        Select select_Mac_politic = new Select(ssid1_select_service);
        select_Mac_politic.selectByIndex(flag);
    }
    public void clickWlanMacFilter(){
        wlanmacfilter.click();
    }

    public void insertMacadress(String macAdress){
        ssid1_input_WifiMacFilterMac0.sendKeys(macAdress);
        apply.click();
    }


}
