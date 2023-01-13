package Class16_DevelopersFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
public class _03_DropDown {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");

        String expectedText = "June";
        List<WebElement> listOfMonths = driver.findElements(By.cssSelector("select[name='Month'] option"));
        selectDdValue(listOfMonths,expectedText);

        tearDown();
    }

}
