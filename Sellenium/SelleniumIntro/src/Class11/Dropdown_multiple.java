package Class11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class Dropdown_multiple {
    public static void main(String[] args) {

        setUp();

        WebElement months = driver.findElement(By.cssSelector("//*[@name='Month']/option"));
        Select select = new Select(months);

        List<WebElement> listOfMonths = select.getOptions();
        int totalMonths = listOfMonths.size();
        System.out.println("total of Months = " + totalMonths);

        for (WebElement listOfMonth : listOfMonths) {
            System.out.println(listOfMonth);
        }


        tearDown();

    }
}
