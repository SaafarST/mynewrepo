package Class11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class _09_DropDown_Assignment_Refactor {

    /**
     * This method gets day as String and returns the given day
     * @param day
     * @return
     */

    static String findDay(String day){
        WebElement DDB = driver.findElement(By.xpath("(//select[@class='day '])[1]"));
        Select selectDay = new Select(DDB);
        selectDay.selectByValue(day);
        System.out.println(day);
        return day;
    }

    /**
     * This method gets month as int and returns the given month
     * @param month
     * @return
     */
    static int findMonth(int month)
    {
        WebElement DMB = driver.findElement(By.xpath("(//select[@class='month '])[1]"));
        Select selectMonth = new Select(DMB);
        selectMonth.selectByIndex(month);
        System.out.println(month);
        return month;
    }

    /**
     * This method gets year as String and returns the given year
     * @param year
     * @return
     */
    static String findYear(String year){
        WebElement DYB = driver.findElement(By.xpath("(//select[@class='year '])[1]"));
        Select selectYear = new Select(DYB);
        selectYear.selectByValue(year);
        System.out.println(year);
        return year;
    }

    /**
     * This method gets a day as String, picks a day and click
     * @param pickDay
     * @return
     */
    static String selectDay(String pickDay){

        WebElement DDB = driver.findElement(By.xpath("(//select[@class='day '])[1]"));
        Select selectDay = new Select(DDB);
        List<WebElement> dayList = selectDay.getOptions();
        for (WebElement days : dayList) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            days.click();
            String daysText = days.getText();
            if (daysText.equals(pickDay)){
                System.out.println(daysText);
                break;
            }
        }
        return pickDay;
    }

    public static void main(String[] args) throws InterruptedException {
        setUp("https://vitalets.github.io/combodate/");

        findDay("25");

        findMonth(4);

        findYear("1985");

        Thread.sleep(2000);

        selectDay("23");

        tearDown();
    }
}
