package Class16_DevelopersFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class _04_DropDown2 {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");

        String expectedText = "April";
        List<WebElement> listOfMonths = driver.findElements(By.cssSelector("select[name='Month'] option"));
        //selectDdValue(listOfMonths,expectedText);

        WebElement monthsDD = driver.findElement(By.cssSelector("select[name='Month']"));

        selectDdValue(monthsDD,expectedText);

        tearDown();
    }

}
