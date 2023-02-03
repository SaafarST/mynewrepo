package Class18_Calendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class _04_Assignment {
    /**
     * /
     *  *    *  Test Case 2: Calendars - American Airlines
     *  *     1. Open Chrome Browser
     *  *     2. Navigate to URL: https://www.aa.com/
     *  *     3. Select From → (LAX)
     *  *     4. Select To → (JFK)
     *  *     5. Number of passengers → 2
     *  *     6. Select Depart → March 01, 2023
     *  *     7. Select Return → April 15, 2023
     *  *     8. Click ‘Search’ to see ticket prices
     *  *     9. Optionally, print ticket price.
     *  *     10. Close the browser.
     *  */
    public static void main(String[] args) {
        //Navigate to URL: https://www.aa.com/:
        setUp("https://www.aa.com/");

        //Depart and return dates:
        String departDate = "March 01, 2023";
        String returnDate = "April 15, 2023";

        //Before selcting depart destination, clear existing:
        driver.findElement(By.xpath("(//input[@class='aaAutoComplete ui-autocomplete-input'])[1]")).clear();

        //3. Select From → (LAX)
        driver.findElement(By.xpath("(//input[@class='aaAutoComplete ui-autocomplete-input'])[1]")).sendKeys("LAX");

        //Click to approve LAX
        driver.findElement(By.xpath("(//input[@class='aaAutoComplete ui-autocomplete-input'])[1]")).click();

        //4. Select To → (JFK) right after it is clickable
        waitForClickability(driver.findElement(By.xpath("(//input[@class='aaAutoComplete ui-autocomplete-input'])[2]")));
        driver.findElement(By.xpath("(//input[@class='aaAutoComplete ui-autocomplete-input'])[2]")).sendKeys("JFK");

        //5. Number of passengers →
        selectDdValue(driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount")),1);

        waitInSeconds(1);

        //Select Depart → March 01, 2023
        click(driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")));

        String datePickerMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
        String datePickerYear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();

        //check for month and year:
        while (!(departDate.contains(datePickerMonth) || departDate.contains(datePickerYear))){
            waitForClickability(driver.findElement(By.xpath("(//a[@class='ui-datepicker-next ui-corner-all'])[1]")));
            click(driver.findElement(By.xpath("(//a[@class='ui-datepicker-next ui-corner-all'])[1]")));
            datePickerMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
            //datePickerYear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
        }

        System.out.println(datePickerYear + " " + departDate.contains(datePickerYear));
        System.out.println(datePickerMonth + " " + departDate.contains(datePickerMonth));

        //Select day of depart:
        List<WebElement> datePickerDays = driver.findElements(By.cssSelector("tbody tr td a"));
        for (WebElement day : datePickerDays) {
            if (day.getText().equals("1"))
            {
                click(day);
                break;
            }
        }

        waitInSeconds(1);

        //Select Return → April 15, 2023
        click(driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")));
        datePickerMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
        datePickerYear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();

        //check for month and year:
        while (!returnDate.contains(datePickerMonth)){
            click(driver.findElement(By.xpath("(//a[@class='ui-datepicker-next ui-corner-all'])[1]")));
            datePickerMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
            //datePickerYear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
        }

        System.out.println(datePickerYear + " " + returnDate.contains(datePickerYear));
        System.out.println(datePickerMonth + " " + returnDate.contains(datePickerMonth));

        //Select day of return:
        datePickerDays = driver.findElements(By.cssSelector("tbody tr td"));
        for (WebElement day : datePickerDays) {
            if (day.getText().equals("15"))
            {
                click(day);
                break;
            }
        }

        //Click to search button>
        click(driver.findElement(By.xpath("(//input[@class='btn btn-fullWidth'])[2]")));

        waitInSeconds(1);

        //tearDown();
    }
}
