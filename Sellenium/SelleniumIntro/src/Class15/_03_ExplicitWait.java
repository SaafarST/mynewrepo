package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.*;

public class _03_ExplicitWait {
    public static void main(String[] args) {

        setUp("http://www.uitestpractice.com");


        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        try {
            driver.findElement(By.xpath("//*[contains(text(),'AjaxCall')]")).click();
            driver.findElement(By.xpath("//*[contains(text(),'This is a Ajax link')]")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated((By.className("ContactUs"))));
            WebElement text = driver.findElement(By.className("ContactUs"));
            System.out.println("text.getText() = " + text.getText());
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Element is not found. Wait longer for the element to be visible on UI.");
        }

        tearDown();
    }
}
