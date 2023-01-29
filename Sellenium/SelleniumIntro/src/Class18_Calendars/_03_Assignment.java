package Class18_Calendars;
import org.openqa.selenium.By;

import static utils.BaseClass.*;

public class _03_Assignment {
    /**
     * /
     *  *   Test Case 1: Calendars - Delta Airlines
     *  *      1. Open Chrome Browser
     *  *      2. Navigate to URL: https://www.delta.com/flight-search/book-a-flight
     *  *      3. Select Depart - Return
     *  *      4. Select departure as April 13, 2023
     *  *      5. Select return/arrival as August 15, 2023
     *  *      6. Print itinerary details in the console
     *  *      7. Close the browser.
     *  */
    public static void main(String[] args) {
        //Get to website:
        setUp("https://www.aa.com/");
        String departDate = "April 13, 2023";
        String returnDate = "August 15, 2023";


        waitInSeconds(3);
        //tearDown();
    }
}
