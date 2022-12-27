package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class _03_Task {
    public static void main(String[] args) throws InterruptedException {
        setUp("http://ui.vision/demo/webtest/frames/");
        WebDriver frame_5 = driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_5.html']")));
        String textForTheLink = frame_5.findElement(By.tagName("a")).getText();
        System.out.println("Text For The Link = " + textForTheLink);
        frame_5.findElement(By.tagName("a")).click();

        tearDown();
    }

}
