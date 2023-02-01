package Class19_Screenshots_Actions_JS;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class _13_InfiniteScrollWithMethods {
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
    public static void scrollToParagraph2(int index) {
        List<WebElement> paragraphs = driver.findElements(By.className("jscroll-added"));
        var jsExecutor = (JavascriptExecutor) driver;
        String script = "window.scrollTo(0, document.body.scrollHeight)";

        while (paragraphs.size() < index) {
            jsExecutor.executeScript(script);
            paragraphs = driver.findElements(By.className("jscroll-added"));
        }
        System.out.println("Total paragraphs: " + paragraphs.size());

    }
    public static void scrollToParagraph(int index) {
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;

        while (getNumberOfParagraphs() < index) {
            jsExecutor.executeScript(script); // scroll down by one <p>
        }
        System.out.println("Total paragraphs: " + getNumberOfParagraphs());
    }

    public static int getNumberOfParagraphs() {
        List<WebElement> paragraphs = driver.findElements(By.className("jscroll-added"));
        return paragraphs.size();
    }
}
