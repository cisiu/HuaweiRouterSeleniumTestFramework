package pageObjects.settingsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;
import pageObjects.LogWindow;

public class SettingsPage {
    final WebDriver driver;
    WebElement wlan;
    WebElement dialup;
    WebElement quick_setup;
    WebElement sntp;
    HomePage homePage;
    LogWindow logWindow;
    int instanceCountOfSettingsPage;

    public SettingsPage(WebDriver driver) {
        this.driver = driver;
        instanceCountOfSettingsPage=+1;
        System.out.println("SettingsPage");
        System.out.println(instanceCountOfSettingsPage);
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
        dialup.click();
    }
    public void internet(){
        wlan.click();
    }


}
