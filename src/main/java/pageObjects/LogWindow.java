package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;


public class LogWindow {
    /***
     * we need to shorten wait impicit wait to few sec
     */
    public WebElement username;
    @CacheLookup
    public WebElement password;
    @CacheLookup
    public WebElement pop_login;


//
//    public LogWindow(WebDriver driver)
//
//    {
////
//    }

    public void LogIn_Action(String sUserName, String sPassword){
        try {
            username.sendKeys(sUserName);
            password.sendKeys(sPassword);
            pop_login.click();
        }
        catch (Exception e){
            System.out.println("login window did not appear");
            }
    }

}