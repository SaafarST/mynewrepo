package Class19_Screenshots_Actions_JS;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.ConfigsReader;

import static utils.BaseClass.*;

public class _11_JSExecuterDemo3 {
    public static void main(String[] args) {
        setUp("https://exelentersdet.com/");

        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));

        sendText(username, ConfigsReader.getProperties("username"));
        sendText(password, ConfigsReader.getProperties("password"));



        tearDown();
    }
}
