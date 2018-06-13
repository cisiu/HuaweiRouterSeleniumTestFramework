package pageObjects.settingsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SettingsPageWlan {
    static int instanceCountOfSettingsPageWLan;
    WebElement wlanmacfilter;
    SettingsPage settingsPage;
    WebElement ssid1_select_service;
    WebElement ssid1_input_WifiMacFilterMac0;
    WebElement apply;
    WebElement pop_confirm;

    public SettingsPageWlan(WebDriver driver) {
        settingsPage = PageFactory.initElements(driver, SettingsPage.class);
        settingsPage.clickWLan();
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
    }

    public void applyChanges(){
        apply.click();
        pop_confirm.click();
    }
}
