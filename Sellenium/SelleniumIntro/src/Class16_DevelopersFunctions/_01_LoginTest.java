package Class16_DevelopersFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ConfigsReader;

import static utils.BaseClass.*;
public class _01_LoginTest {
    public static void main(String[] args) {
        setUp("https://exelentersdet.com");

        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        WebElement loginBtn = driver.findElement(By.id("btnLogin"));

        //This is without function:
       // username.sendKeys("Admin");

        //This is with function:
        //sendText(username,"Admin");
        sendText(username, ConfigsReader.getProperties("username"));
        sendText(password, ConfigsReader.getProperties("password"));
        clickButWaitForClickability(loginBtn);

        tearDown();
    }

}
