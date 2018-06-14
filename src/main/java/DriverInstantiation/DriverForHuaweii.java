package DriverInstantiation;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverForHuaweii {
    public WebDriver driver;
    public DriverForHuaweii() throws MalformedURLException {
//        WebDriver driver;
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://192.168.1.1");
    }
}
