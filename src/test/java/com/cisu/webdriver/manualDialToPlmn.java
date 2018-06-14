package com.cisu.webdriver;

//import com.cisu.pageObjects.HomePage;
//import com.cisu.pageObjects.LogWindow;
//import com.cisu.pageObjects.SmsPage;
import DriverInstantiation.DriverForHuaweii;
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
import pageObjects.settingsPage.SettingsPageDialUp;
import pageObjects.settingsPage.SettingsPageWlan;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class manualDialToPlmn {


    DriverForHuaweii driverForHuaweii;
    SettingsPageDialUp settingsPageDialUp;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        driverForHuaweii = new DriverForHuaweii();
        driverForHuaweii.driver.get("http://192.168.1.1");
    }

    @Test
    public void test() {

        settingsPageDialUp = PageFactory.initElements(driverForHuaweii.driver, SettingsPageDialUp.class);
        settingsPageDialUp.ClickUstawieniaSieci();
        settingsPageDialUp.NetworkSelectMode(1);
        settingsPageDialUp.applyChanges();
        settingsPageDialUp.selectPlayPlmn();
    }
    @AfterMethod
    public void afterMethod() {
        settingsPageDialUp.NetworkSelectMode(0);
        settingsPageDialUp.applyChanges();
        driverForHuaweii.driver.get("http://192.168.1.4");
        driverForHuaweii.driver.quit();
    }
}