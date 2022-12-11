package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;


public class DropdownDemo {
    public static void main(String[] args) {
        setUp();
        List<WebElement> countries = driver.findElements(By.cssSelector("select[name=country] option"));
        for (WebElement country:countries)
        {
            System.out.println("country = " + country);
        }

        tearDown();

    }
}
