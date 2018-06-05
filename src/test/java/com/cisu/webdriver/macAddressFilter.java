package com.cisu.webdriver;

//import com.cisu.pageObjects.HomePage;
//import com.cisu.pageObjects.LogWindow;
//import com.cisu.pageObjects.SmsPage;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.settingsPage.SettingsPage;
import pageObjects.LogWindow;
import pageObjects.settingsPage.SettingsPageWlan;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class macAddressFilter {

    static WebDriver driver;
    HomePage homePage;
    LogWindow logWindow;
    SettingsPageWlan settingsPage;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {

        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.get("http://www.samsung.com");
        driver.get("http://192.168.1.1");
//        HomePage = PageFactory.initElements(driver, Home_PG_POF.class);
//        homePage = PageFactory.initElements(driver, HomePage.class);
//        logWindow = PageFactory.initElements(driver, LogWindow.class);
//        settingsPage = PageFactory.initElements(driver, SettingsPageWlan.class);


    }

    @Test
    public void test() {
        SettingsPageWlan settingsPageWlan;
        settingsPageWlan = PageFactory.initElements(driver, SettingsPageWlan.class);
        settingsPageWlan.clickWlanMacFilter();

    }
    @AfterMethod
    public void afterMethod() {
        driver.get("http://192.168.1.2");
        driver.quit();
    }
}