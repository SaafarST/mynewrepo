package Class15;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;
public class _01_WaitDemo {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.cssSelector("div#start button")).click(); //
        WebElement helloWorldText = driver.findElement(By.cssSelector("div#finish h4"));
        System.out.println("helloWorldText.getText() = " + helloWorldText.getText());

        //tearDown();
    }
}
