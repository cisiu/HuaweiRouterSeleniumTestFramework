package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StatisticPage {
    final WebDriver driver;

    WebElement agile_edit_volume;
    WebElement mobile_start_date_select;
    WebElement mobile_data_volume;
    WebElement mobile_data_nuit_select;
    WebElement mobile_threshold_select;
    WebElement pop_Save;
    WebElement month_used_value;
    WebElement pop_confirm;

    public StatisticPage(WebDriver driver) {
        this.driver = driver;
    }
    public void Select_Day(int day_nr){
//        return new Select(mobile_start_date_select);
        Select select_date = new Select(mobile_start_date_select);
        select_date.selectByIndex(day_nr);
    }

    public void setDataVolume(Integer vol){
        mobile_data_volume.clear();
        mobile_data_volume.sendKeys(vol.toString());
    }

    public void setTresholdVolume(Integer vol){
        mobile_threshold_select.clear();
        mobile_threshold_select.sendKeys(vol.toString());
    }

    public void saveButton(){
        pop_Save.click();
    }

    public void selectDataUnit(String unit){
        Select selDataUnit = new Select(mobile_data_nuit_select);
        selDataUnit.selectByVisibleText(unit);
    }

    public void getTaaa(){
//        month_used_value.getText();
        System.out.println(month_used_value.getText());
    }

    public void Edit_Action(){
        agile_edit_volume.click();
    }
    public void popConfirm(){pop_confirm.click();}
}
