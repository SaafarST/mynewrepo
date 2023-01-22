package Class18;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
public class _01_SimpleCalendar {
    public static void main(String[] args) {
        setUp("https://demoqa.com/date-picker");

        //Let's pick 17.10.2020:
        //Select date picker:
        driver.findElement(By.cssSelector("#datePickerMonthYearInput")).click();

        WebElement monthsDD = driver.findElement(By.cssSelector("select[class='react-datepicker__month-select']"));
        selectDdValue(monthsDD,9);

        WebElement yearsDD = driver.findElement(By.cssSelector("select[class='react-datepicker__year-select']"));
        selectDdValue(yearsDD,2020);

        List<WebElement> daysDD = driver.findElements(By.cssSelector("div.react-datepicker__week div"));
        selectDdValue(daysDD,"17");

        String pickerFieldText = driver.findElement(By.id("dateAndTimePickerInput")).getAttribute("value");
        System.out.println(pickerFieldText);

        tearDown();
    }
}
