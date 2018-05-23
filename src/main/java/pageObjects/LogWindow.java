package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;


public class LogWindow {

    final WebDriver driver;

//    @FindBy(how = How.XPATH, using = ".//*[@id='account']/a")

    public WebElement username;

//    @FindBy(how = How.XPATH, using = ".//*[@id='account_logout']/a")

    public WebElement password;
    public WebElement pop_login;

// This is a constructor, as every page need a base driver to find web elements

    public LogWindow(WebDriver driver)

    {

        this.driver = driver;

    }

    public void LogIn_Action(String sUserName, String sPassword){
        try {
            username.sendKeys(sUserName);
            password.sendKeys(sPassword);
            pop_login.click();
        }
        catch (Exception e){
            System.out.println("login window did not appear");
            }
//        btn_Login.click();

    }

}