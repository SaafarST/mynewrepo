package Class15;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static utils.BaseClass.*;

public class _04_TaskForExplicitWait {
    public static void main(String[] args) {

        setUp("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.partialLinkText("Example 2: Element rendered after the fact")).click();
        driver.findElement(By.id("start")).click();


        //tearDown();
    }
}
