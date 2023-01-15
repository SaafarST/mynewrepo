package Class16_DevelopersFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class _05_DropDown3 {
    public static void main(String[] args) {
        setUp("https://vitalets.github.io/combodate");

        WebElement dayDD = driver.findElement(By.xpath("(// select[@class='day '])[1]"));
        WebElement monthDD = driver.findElement(By.xpath("(// select[@class='month '])[1]"));
        WebElement yearDD = driver.findElement(By.xpath("(// select[@class='year '])[1]"));
        selectDdValue(dayDD,23);
        selectDdValue(monthDD,3);
        selectDdValue(monthDD,"Apr");
        selectDdValue(yearDD,"1978");

        //Assume dropdown element does not have class tag?
        List<WebElement> daysDD = driver.findElements(By.xpath("(// select[@class='day '])[1]/option"));
        selectDdValue(daysDD,"17");
        List<WebElement> monthsDD = driver.findElements(By.xpath("(// select[@class='month '])[1]/option"));
        selectDdValue(monthsDD,"Apr");
        List<WebElement> yearsDD = driver.findElements(By.xpath("(// select[@class='year '])[1]/option"));
        selectDdValue(yearsDD,"2005");

        tearDown();
    }




}
