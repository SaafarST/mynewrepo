package Class11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class _09_DropDown_Assignment_Refactor2 {

    public static void main(String[] args) throws InterruptedException {

        setUp("https://vitalets.github.io/combodate/");

        findDate(4,"23","1985");

        tearDown();
    }

    /**
     * This method gets day (string), month(int) and year(string) and prints
     * @param month
     * @param day
     * @param year
     */

     static void findDate(int month, String day, String year){


        WebElement DDB = driver.findElement(By.xpath("(//select[@class='day '])[1]"));
        Select selectDay = new Select(DDB);
        selectDay.selectByValue(day);

        WebElement DMB = driver.findElement(By.xpath("(//select[@class='month '])[1]"));
        Select selectMonth = new Select(DMB);
        selectMonth.selectByIndex(month);

        WebElement DYB = driver.findElement(By.xpath("(//select[@class='year '])[1]"));
        Select selectYear = new Select(DYB);
        selectYear.selectByValue(year);

        System.out.println(month+"/"+day+"/"+year);

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


}
