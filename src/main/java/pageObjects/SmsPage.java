package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SmsPage {
    final WebDriver driver;
    WebElement message;
    WebElement recipients_number;
    WebElement message_content;
    WebElement pop_save_to_drafts;
    WebElement drafts;
    @FindBy(how= How.XPATH,using="//*[@id=\"sms_table\"]/tbody/tr[2]/td[3]/pre")
    WebElement ksd;

    public void createMessageToDraft(String phoneNr,String messageContent ){
        message.click();
        recipients_number.sendKeys(phoneNr);
        message_content.sendKeys(messageContent);
        pop_save_to_drafts.click();
        drafts.click();
        System.out.println(ksd.getText());
    }

    public SmsPage(WebDriver driver) {
        this.driver = driver;
    }

}
