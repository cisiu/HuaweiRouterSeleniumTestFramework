package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;


public class LogWindow {

    public WebElement username;
    public WebElement password;
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