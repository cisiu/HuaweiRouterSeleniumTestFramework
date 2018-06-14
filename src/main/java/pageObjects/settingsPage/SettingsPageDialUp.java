package pageObjects.settingsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SettingsPageDialUp {

    WebElement label_mobile_network_settings;
    SettingsPage settingsPage;
    WebElement dialup;
    WebElement pop_confirm;
    WebElement network_select;
    WebElement mobilensetting_apply;
    WebElement pop_OK;
    @FindBy(how= How.XPATH,using="//*[@id=\"plmn_list\"]//label[text()=\"PLAY LTE\"]")
    WebElement PlayPlmn;

    public SettingsPageDialUp(WebDriver driver) {
        settingsPage = PageFactory.initElements(driver, SettingsPage.class);
        settingsPage.clickWLan();
    }

    public void NetworkSelectMode(int flag){
        Select select_network = new Select(network_select);
        select_network.selectByIndex(flag);
    }

    public void ClickUstawieniaSieci(){
        dialup.click();
        label_mobile_network_settings.click();
    }

    public void selectPlayPlmn(){
        PlayPlmn.click();
        pop_OK.click();
    }

    public void applyChanges(){
        mobilensetting_apply.click();
        pop_confirm.click();
    }
}
