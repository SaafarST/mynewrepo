package Class19_Screenshots_Actions_JS;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static utils.BaseClass.*;

public class _05_ActionsKEyPresses {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Key Presses")).click();

        WebElement inputField = driver.findElement(By.cssSelector("input#target"));

        //Actions actions = new Actions(driver);
        inputField.sendKeys("A");
        waitInSeconds(1);
        inputField.sendKeys(Keys.SPACE);
        waitInSeconds(1);
        inputField.sendKeys("B");
        waitInSeconds(1);
        inputField.sendKeys(Keys.BACK_SPACE);
        waitInSeconds(1);
        inputField.sendKeys("C");
        waitInSeconds(1);
        inputField.sendKeys(Keys.ARROW_LEFT);
        waitInSeconds(1);
        inputField.sendKeys("B");
        waitInSeconds(1);
        inputField.sendKeys(Keys.ARROW_RIGHT);
        waitInSeconds(1);
        inputField.sendKeys(Keys.SHIFT+"abc");


        waitInSeconds(1);
        tearDown();
    }
}
