package pageObjects.settingsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SettingsPageWlan extends SettingsPage{

    WebElement wlanmacfilter;
    SettingsPage wlanPage;

    public SettingsPageWlan(WebDriver driver) {
        super(driver);
//        super.clickWLan();
        wlanPage = PageFactory.initElements(driver, SettingsPage.class);
        wlanPage.wlan.click();
    }

    public void clickWlanMacFilter(){
        wlanmacfilter.click();
    }

}
