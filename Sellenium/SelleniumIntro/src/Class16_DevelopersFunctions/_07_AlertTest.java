package Class16_DevelopersFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class _07_AlertTest {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/07/alert-test.html");

        driver.findElement(By.id("simple")).click();
        acceptAlert();
        waitInSeconds(2);

        driver.findElement(By.id("confirm")).click();
        dismissAlert();
        waitInSeconds(2);

        driver.findElement(By.id("prompt")).click();
        sendAlertText("Tjuu");
        waitInSeconds(1);
        acceptAlert();
        waitInSeconds(1);

        tearDown();
    }




}
