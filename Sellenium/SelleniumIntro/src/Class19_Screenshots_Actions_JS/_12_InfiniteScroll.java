package Class19_Screenshots_Actions_JS;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.ConfigsReader;

import java.util.List;

import static utils.BaseClass.*;

public class _12_InfiniteScroll {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Infinite Scroll")).click();
        waitInSeconds(2);

        List<WebElement> paragraphs = driver.findElements(By.cssSelector("div[class='jscroll-added']"));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        System.out.println("Number of paragraphs: "+paragraphs.size());

        while (paragraphs.size()<10){
            javascriptExecutor.executeScript(script);
            paragraphs = driver.findElements(By.cssSelector("div[class='jscroll-added']"));
        }

        waitInSeconds(2);
        javascriptExecutor.executeScript("window.scrollBy(0,-document.body.scrollHeight || -document.documentElement.scrollHeight)", "");

        tearDown();
    }
}
