package pageObjects.settingsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;
import pageObjects.LogWindow;
import pageObjects.dzienniki;

import java.util.logging.Logger;

public class SettingsPage {
    final WebDriver driver;
    private final static Logger LOGGER = Logger.getLogger(dzienniki.class .getName());
    @CacheLookup
    WebElement wlan;
    @CacheLookup
    WebElement dialup;
    @CacheLookup
    WebElement quick_setup;
    @CacheLookup
    WebElement sntp;
    @CacheLookup
    HomePage homePage;
    @CacheLookup
    LogWindow logWindow;

    public SettingsPage(WebDriver driver) {
        this.driver = driver;
        homePage = PageFactory.initElements(driver, HomePage.class);
        logWindow = PageFactory.initElements(driver, LogWindow.class);
        homePage.menu_settings.click();
        LOGGER.info("SettingPage initialised");
        logWindow.LogIn_Action("admin", "admin");
    }

    public void clickWLan(){
        wlan.click();
    }
    public void clickQuick_setup(){
        quick_setup.click();
    }

    public void clickSntp(){
        sntp.click();
    }
    public void clickDialup(){
        dialup.click();
    }
    public void internet(){
        wlan.click();
    }


}
