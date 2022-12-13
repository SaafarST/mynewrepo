package Class11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class Dropdown_multiple {
    public static void main(String[] args) {

        setUp();


        WebElement months = driver.findElement(By.cssSelector("/html/body/div[1]/div[2]/div[1]/div/div/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div[3]/select"));
        Select select = new Select(months);

        List<WebElement> listOfMonths = select.getOptions();
        int totalMonths = listOfMonths.size();
        System.out.println("total of Months = " + totalMonths);




    }
}
