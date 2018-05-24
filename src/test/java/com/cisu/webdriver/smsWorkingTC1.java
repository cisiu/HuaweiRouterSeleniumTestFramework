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
import pageObjects.SmsPage;
import pageObjects.LogWindow;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class smsWorkingTC1 {

    static WebDriver driver;
    HomePage homePage;
    LogWindow logWindow;
    SmsPage smsPage;

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
        homePage = PageFactory.initElements(driver, HomePage.class);
        logWindow = PageFactory.initElements(driver, LogWindow.class);
        smsPage = PageFactory.initElements(driver, SmsPage.class);
    }

    @Test
    public void test() {
        homePage.menu_sms.click();
        logWindow.LogIn_Action("admin", "admin");
        smsPage.createMessageToDraft("792308126", "to jest robocza wiad.");

    }
    @AfterMethod
    public void afterMethod() {
        driver.get("http://192.168.1.2");
        driver.quit();
    }
}