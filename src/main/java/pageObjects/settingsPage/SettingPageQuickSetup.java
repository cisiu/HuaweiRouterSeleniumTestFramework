package pageObjects.settingsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;
import pageObjects.LogWindow;
import pageObjects.Logs;

import java.util.logging.Logger;

public class SettingPageQuickSetup {
    final WebDriver driver;
    private final static Logger LOGGER = Logger.getLogger(Logs.class .getName());

    @CacheLookup
    WebElement quick_setup;
    @CacheLookup
    HomePage homePage;
    @CacheLookup
    LogWindow logWindow;
    WebElement step1;
    WebElement step2_next;
    WebElement step4_next;
    WebElement step_finish;

    public SettingPageQuickSetup(WebDriver driver) {
        this.driver = driver;
        homePage = PageFactory.initElements(driver, HomePage.class);
        logWindow = PageFactory.initElements(driver, LogWindow.class);
        homePage.menu_settings.click();
        LOGGER.info("SettingPage initialised");
        logWindow.LogIn_Action("admin", "admin");
    }

    public void clickQuick_setup(){
        quick_setup.click();
    }
    public void clickStep1(){
        step1.click();
    }
    public void clickStep2_next(){
        step2_next.click();
    }
    public void clickStep4_next(){
        step4_next.click();
    }
    public void clickStepFinish(){
        step_finish.click();
    }



}
