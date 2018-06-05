package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPage {
    final WebDriver driver;
    WebElement wlan;

    public SettingsPage(WebDriver driver) {
        this.driver = driver;
    }
}
