package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class _02_Dropdown_checkUSA {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");
        WebElement countrySC = driver.findElement(By.cssSelector("select[name=country]"));
        Select select = new Select(countrySC);

        List<WebElement> countries = select.getOptions();
        boolean status = false;

        for (WebElement country : countries) {
            if(country.getText().equals("United States of America")){
                System.out.println("Test successfully implemented.");
                status = true;
                break;}
        }
        if (status == false){
                System.out.println("Test failed, no such country exists");
            }

        tearDown();
    }
}
