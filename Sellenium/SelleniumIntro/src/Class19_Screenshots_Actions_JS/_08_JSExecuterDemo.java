package Class19_Screenshots_Actions_JS;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static utils.BaseClass.*;

public class _08_JSExecuterDemo {
    public static void main(String[] args) {
        setUp("https://www.ebay.com");

        driver.findElement(By.linkText("Электроника")).click();
        waitInSeconds(2);

        String script = "arguments[0].scrollIntoView(true);";

        WebElement smartShopping = driver.findElement(By.xpath("(//div/h2)[10]"));
        ((JavascriptExecutor) driver).executeScript(script,smartShopping);


        waitInSeconds(1);
        tearDown();
    }
}
