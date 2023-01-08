package Class15;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.*;

public class _04_TaskForExplicitWait {
    public static void main(String[] args) {

        setUp("https://the-internet.herokuapp.com");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40)); // Implicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));

        try {
            driver.findElement(By.linkText("Dynamic Loading")).click();
            driver.findElement(By.partialLinkText("Example 2: Element rendered after the fact")).click();
            //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div#finish h4"))));
            driver.findElement(By.xpath("//*[contains(text(),'Start')]")).click();//dic#start button ---> CSS locator
            wait.until(ExpectedConditions.textToBe(By.cssSelector("div#finish h4"),"Hello World!"));


            System.out.println(driver.findElement(By.cssSelector("div#finish h4")).getText());
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Element is mnot found, wait longer for the element to become visible.");
        }

        tearDown();
    }
}
