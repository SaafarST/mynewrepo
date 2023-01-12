package Class16_DevelopersFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _01_LoginTest {
    public static void main(String[] args) {
        setUp("https://exelentersdet.com");


        WebElement username = driver.findElement(By.id("txtUsername"));
        //This is without function:
        username.sendKeys("Admin");

        //This is with function:
        sendText(username,"Admin");

        tearDown();
    }
    public static void sendText(WebElement element, String value){
        element.sendKeys(value);
    }
}