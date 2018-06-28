package com.cisu.webdriver;

//import com.cisu.pageObjects.HomePage;
//import com.cisu.pageObjects.LogWindow;
//import com.cisu.pageObjects.SmsPage;
import DriverInstantiation.DriverForHuaweii;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.settingsPage.SettingPageQuickSetup;
import pageObjects.settingsPage.SettingsPageWlan;

import java.net.MalformedURLException;

public class fastConfiguration {

    DriverForHuaweii driverForHuaweii;
    SettingPageQuickSetup settingsPageQuickSetup;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {

        driverForHuaweii = new DriverForHuaweii();
        driverForHuaweii.driver.get("http://192.168.1.1");
    }

    @Test
    public void test() {

        settingsPageQuickSetup = PageFactory.initElements(driverForHuaweii.driver, SettingPageQuickSetup.class);
        settingsPageQuickSetup.clickStep1();
        settingsPageQuickSetup.clickStep2_next();
        settingsPageQuickSetup.clickStep4_next();
        settingsPageQuickSetup.clickStepFinish();

//        settingsPageWlan.MacFilterFlag(2);
//        settingsPageWlan.insertMacadress("24:18:1D:37:A9:A3");
//        settingsPageWlan.applyChanges();
    }
    @AfterMethod
    public void afterMethod() {
//        settingsPageWlan.clickWlanMacFilter();
//        settingsPageWlan.MacFilterFlag(0);
//        settingsPageWlan.applyChanges();
//        settingsPageWlan.insertMacadress("24:18:1D:37:A9:A3");
        driverForHuaweii.driver.get("http://192.168.1.4");
        driverForHuaweii.driver.quit();
    }
}