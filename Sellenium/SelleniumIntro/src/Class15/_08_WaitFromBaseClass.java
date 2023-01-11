package Class15;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static utils.BaseClass.*;

public class _08_WaitFromBaseClass {
    public static void main(String[] args) {
        setUp("https://omayo.blogspot.com");


        driver.findElement(By.cssSelector("button[class='dropbtn']")).click();/
        driver.findElement(By.partialLinkText("Face")).click();

        tearDown();
    }
}
