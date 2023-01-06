package Class15;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static utils.BaseClass.*;

public class _02_TaskForImplicitWait {
    public static void main(String[] args) {

        setUp("http://www.uitestpractice.com");

        //Part 1:
        //driver.findElement(By.xpath("//*[contains(text(),'AjaxCall')]")).click();
        //driver.findElement(By.linkText("/Students/_P1")).click();

        //Part 2:
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
        driver.findElement(By.xpath("//*[contains(text(),'AjaxCall')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'This is a Ajax link')]")).click();
        WebElement text = driver.findElement(By.className("ContactUs"));
        System.out.println("text.getText() = " + text.getText());

        tearDown();
    }
}
