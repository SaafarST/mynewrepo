package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;


public class DropdownDemo {
    public static void main(String[] args) throws InterruptedException {

        setUp();

     /*   //First way without using Select class
        List<WebElement> countries = driver.findElements(By.cssSelector("select[name=country] option"));
        for (WebElement country:countries)
        {
            System.out.println("country = " + country.getText());
        }*/

        //Select class
        WebElement countrySC = driver.findElement(By.cssSelector("select[name=country]"));
        Select select = new Select(countrySC);

        List<WebElement> countriesList = select.getOptions();
        System.out.println("Total number pf countries = " + countriesList);

        for (WebElement country:countriesList){
            country.click();
            Thread.sleep(30);
        }


        tearDown();
    }
}
