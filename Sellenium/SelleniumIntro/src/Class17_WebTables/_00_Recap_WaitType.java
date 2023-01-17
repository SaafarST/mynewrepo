package Class17_WebTables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.*;
public class _00_Recap_WaitType {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[contains(text(),'Dynamic Controls')]")).click();
        waitInSeconds(3);

        WebElement checkboxBtn = driver.findElement(By.cssSelector("input[type='checkbox']"));
        System.out.println(checkboxBtn.isSelected());
        checkboxBtn.click();
        System.out.println(checkboxBtn.isSelected());

        WebElement button = driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']"));
        System.out.println(button.getText());
        button.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        String text = driver.findElement(By.id("message")).getText();
        System.out.println(text);
        System.out.println(button.getText());

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));     // this is for Explicit wait only, comment it out when using Implicit wait
        String message = driver.findElement(By.id("message")).getText();
        System.out.println("message: " + message);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        button.click();
        System.out.println(driver.findElement(By.id("message")).getText());

        waitInSeconds(2);
        tearDown();
    }
}
