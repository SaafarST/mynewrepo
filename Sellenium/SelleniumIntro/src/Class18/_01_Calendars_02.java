package Class18;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

import java.awt.*;
import java.util.List;

import static utils.BaseClass.*;

public class _01_Calendars_02 extends BaseClass {
    public static void main(String[] args) {
        setUp("https://www.expedia.com/flights");


        driver.findElement(By.cssSelector("h1[class='uitk-heading uitk-heading-3']")).click();
        driver.findElement(By.id("d1-btn")).click();
        String expectedDeparture = "May 17 2023";
        String expectedArrival = "July 26 2023";
        WebElement departureScreen = driver.findElement(By.xpath("(//h2[@class='uitk-date-picker-month-name uitk-type-medium'])[1]"));
        while (!departureScreen.getText().contains(expectedDeparture.split(" ")[0]))
        {
            nextMonth();
            waitInSeconds(1);
            departureScreen = driver.findElement(By.xpath("(//h2[@class='uitk-date-picker-month-name uitk-type-medium'])[1]"));
        }

        List<WebElement> days = driver.findElements(By.xpath("(//table[@class='uitk-date-picker-weeks'])[1]//tbody"));

        for (WebElement day : days) {
            if (day.getAttribute("data-day").equals(expectedDeparture.split(" ")[1])){
                day.click();
                break;
            }
        }

        waitInSeconds(1);

        //for return:

        while (!departureScreen.getText().contains(expectedArrival.split(" ")[0]))
        {
            nextMonth();
            waitInSeconds(1);
            departureScreen = driver.findElement(By.xpath("(//h2[@class='uitk-date-picker-month-name uitk-type-medium'])[1]"));
        }

        days = driver.findElements(By.xpath("(//table[@class='uitk-date-picker-weeks'])[1]//tbody"));

        for (WebElement day : days) {
            if (day.getAttribute("data-day").equals(expectedArrival.split(" ")[1])){
                day.click();
                break;
            }
        }

        //once departure and arrival dates are selected, click DONE:
        driver.findElement(By.xpath("(//button[text()='Done'])[2]")).click();

        waitInSeconds(4);

        tearDown();
    }
    static void nextMonth(){
        driver.findElement(By.cssSelector(".uitk-calendar button:nth-child(2)")).click();
    }
}
