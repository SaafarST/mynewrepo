package Class11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class _08_DropDown_Assignment {
    public static void main(String[] args) throws InterruptedException {
        setUp();

        //1. Find the day
        WebElement DDB = driver.findElement(By.xpath("(//select[@class='day '])[1]"));
        Select day = new Select(DDB);
        day.selectByValue("3");

        //2. Find the month
        WebElement DMB = driver.findElement(By.xpath("(//select[@class='month '])[1]"));
        Select month = new Select(DMB);
        month.selectByIndex(4);

        //3. Find the yar
        WebElement DYB = driver.findElement(By.xpath("(//select[@class='year '])[1]"));
        Select year = new Select(DYB);
        year.selectByValue("1985");

        Thread.sleep(2000);

        //Loop through the day06, find specific day and click
        List<WebElement> dayList = day.getOptions();
        for (WebElement days : dayList) {
            Thread.sleep(30);
            days.click();
            String daysText = days.getText();
            if (daysText.equals("24")){
                System.out.println(daysText);
                break;
            }
        }

        tearDown();
    }
}
