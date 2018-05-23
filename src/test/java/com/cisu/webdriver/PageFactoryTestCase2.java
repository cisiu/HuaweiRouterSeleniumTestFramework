package com.cisu.webdriver;

//import com.cisu.pageObjects.HomePage;
import pageObjects.LogWindow;
import pageObjects.StatisticPage;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class PageFactoryTestCase2 {

    static WebDriver driver;
    HomePage homePage;
    LogWindow logWindow;
    StatisticPage statisticPage;

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
        statisticPage = PageFactory.initElements(driver, StatisticPage.class);
    }

    @Test
    public void test() {
        homePage.menu_statistic.click();
//        System.out.println(homePage.menu_statistic.isEnabled());
        logWindow.LogIn_Action("admin","admin");
        statisticPage.Edit_Action();
        statisticPage.Select_Day(20);
        statisticPage.setDataVolume(40);
        statisticPage.selectDataUnit("MB");
        statisticPage.setTresholdVolume(85);
        statisticPage.saveButton();
        statisticPage.getTaaa();
        statisticPage.popConfirm();
    }

    @AfterMethod
    public void afterMethod() {
        homePage.menu_statistic.click();
//        System.out.println(homePage.menu_statistic.isEnabled());
        statisticPage.Edit_Action();
        statisticPage.popConfirm();
        statisticPage.Select_Day(1);
        statisticPage.setDataVolume(100);
        statisticPage.selectDataUnit("GB");
        statisticPage.setTresholdVolume(85);
        statisticPage.saveButton();
        driver.get("http://192.168.1.2");
        driver.quit();

    }
}