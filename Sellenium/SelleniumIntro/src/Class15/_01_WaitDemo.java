package Class15;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static utils.BaseClass.*;
public class _01_WaitDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //This is implicit wait and dynamic
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //This is implicit wait in Selenium 3

        try {
            driver.findElement(By.cssSelector("div#start button")).click(); //Locate 'Start' button element and click on it
            WebElement helloWorldText = driver.findElement(By.cssSelector("div#finish h4"));//Locate Hello World web element and store
            System.out.println("helloWorldText.getText() = " + helloWorldText.getText());//Print the text
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Element is not found. You wanna wait longer for it to appear?");
        }



        tearDown();
    }
}
