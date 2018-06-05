package pageObjects.settingsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;
import pageObjects.LogWindow;

public class SettingsPage {
    final WebDriver driver;
    WebElement wlan;
    WebElement quick_setup;
    WebElement sntp;
    HomePage homePage;
    LogWindow logWindow;

    public SettingsPage(WebDriver driver) {
        this.driver = driver;
        homePage = PageFactory.initElements(driver, HomePage.class);
        logWindow = PageFactory.initElements(driver, LogWindow.class);
        homePage.menu_settings.click();
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
        wlan.click();
    }
    public void internet(){
        wlan.click();
    }


}
