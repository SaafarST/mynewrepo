package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _01_CheckBoxAndRadioButtons {
    public static void main(String[] args) {
        setUp();
        //WebElement checkbox = driver.findElement(By.cssSelector("#content > ul > li:nth-child(6) > a"));
        WebElement checkboxes = driver.findElement(By.linkText("Checkboxes"));
        checkboxes.click();

        WebElement checkbox1 = checkboxes.findElement(By.linkText(" checkbox 1"));
        WebElement checkbox2 = checkboxes.findElement(By.linkText(" checkbox 2"));

        final boolean displayed = checkbox1.isDisplayed();

        tearDown();


    }
}
