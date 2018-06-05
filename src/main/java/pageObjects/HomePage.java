package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

//import org.openqa.selenium.support.How;

public class HomePage {
    final WebDriver driver;

//    @FindBy(how = How.XPATH, using = "//*[@id=\"menu_statistic\"]")
    public WebElement menu_statistic;
    public WebElement menu_index;
    public WebElement menu_sms;
    public WebElement menu_ussd;
    public WebElement menu_update;
    public WebElement menu_sharing;
    public WebElement menu_settings;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
}
