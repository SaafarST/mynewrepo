package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;


public class DropdownDemo02 {
    public static void main(String[] args) throws InterruptedException {

        setUp();


        //Select class
        WebElement countrySC = driver.findElement(By.cssSelector("select[name=country]"));
        Select select = new Select(countrySC);

       //1. Select by index
        select.selectByIndex(125);
        Thread.sleep(1000);

        //2. Select by value
        select.selectByValue("JP");
        Thread.sleep(1000);

        //3. Select by visible text
        select.selectByVisibleText("Italy");

        List<WebElement> countries = select.getOptions();
        for (int i = 0; i <countries.size(); i++) {
            if (countries.get(i).getText().equals("Japan")){
                countries.get(i).click();
                break;
            }
        }

        tearDown();
    }
}
