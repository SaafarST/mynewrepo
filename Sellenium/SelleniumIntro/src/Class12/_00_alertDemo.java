package Class12;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;
public class _00_alertDemo {
    public static void main(String[] args) {
        setUp();//https://selenium08.blogspot.com/2019/07/alert-test.html
        driver.manage().window().maximize();
        WebElement SimpleAlert = driver.findElement(By.cssSelector("[id='simple']"));
        SimpleAlert.click();
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();

        tearDown();
    }
}
