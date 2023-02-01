package Class19_Screenshots_Actions_JS;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _10_JSExecuterDemo2 {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Large & Deep DOM")).click();

        String script = "arguments[0].scrollIntoView(true);";

        WebElement table = driver.findElement(By.id("large-table"));
        ((JavascriptExecutor)driver).executeScript(script,table);

        waitInSeconds(1);

        waitInSeconds(1);
        tearDown();
    }
}
