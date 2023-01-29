package Class19_Screenshots_Actions_JS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;

import static utils.BaseClass.*;
public class _04_ActionsClass {
    public static void main(String[] args) {
        setUp("https://www.ebay.com");

        WebElement myeBay = driver.findElement(By.linkText("Мой eBay"));
        Actions actions = new Actions(driver);
        actions.moveToElement(myeBay).perform();

        String summaryText = driver.findElement(By.xpath("(//ul[@id='gh-ul-nav']//a)[1]")).getText();
        if (summaryText.contains("Краткий обзор")){
            System.out.println("Hover over eBay is successfull.");
        }else {
            System.out.println("Hover did not work.");
        }

        waitInSeconds(1);

        WebElement electronicsMenu = driver.findElement(By.linkText("Электроника"));
        actions.moveToElement(electronicsMenu).perform();
        waitInSeconds(1);
        actions.contextClick(electronicsMenu).perform();
        waitInSeconds(1);
        //electronicsMenu.sendKeys(Keys.ESCAPE);
        //actions.sendKeys(Keys.ESCAPE).build().perform();

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_ESCAPE);
        waitInSeconds(1);

        driver.navigate().to("https://demoqa.com/buttons");
        waitInSeconds(1);

        actions.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());

        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).perform();

        System.out.println(driver.findElement(By.id("rightClickMessage")).getText());

        waitInSeconds(1);
        tearDown();
    }
}
