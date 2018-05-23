package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SmsPage {
    final WebDriver driver;
    WebElement message;
    WebElement recipients_number;
    WebElement message_content;
    WebElement pop_save_to_drafts;

    public void createMessageToDraft(String phoneNr,String messageContent ){
        message.click();
        recipients_number.sendKeys(phoneNr);
        message_content.sendKeys(messageContent);
        pop_save_to_drafts.click();
    }

    public SmsPage(WebDriver driver) {
        this.driver = driver;
    }
}
