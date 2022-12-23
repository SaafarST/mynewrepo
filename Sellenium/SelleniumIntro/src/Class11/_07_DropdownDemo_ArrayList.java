package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static utils.BaseClass.*;


public class _07_DropdownDemo_ArrayList {
    public static void main(String[] args) throws InterruptedException {

        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");


        WebElement months = driver.findElement(By.cssSelector("select[name=Month]"));
        Select select = new Select(months);

        List<WebElement> listOfMonths = select.getOptions();
        System.out.println("Total number pf months = " + listOfMonths.size());

        List<String> expectedList = new ArrayList<>();
        expectedList.add("March");
        expectedList.add("July");
        expectedList.add("August");
        expectedList.add("December");

        List<String> actualList = new ArrayList<>();
        for (WebElement month : listOfMonths) {
            actualList.add(month.getText());
        }

        if (actualList.containsAll(expectedList))
            System.out.println("List does match, Test passed.");
        else
            System.err.println("The list does not exist, test failed.");

        System.out.println("Actual list:");
        for (String actual : actualList) {
            System.out.println(actual);
        }
        System.out.println("Expected list:");
        for (String expected : expectedList) {
            System.out.println(expected);
        }

        tearDown();
    }
}
