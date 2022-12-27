package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class _02_FramesDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("http://ui.vision/demo/webtest/frames/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks = " + allLinks.size());


        List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
        int numberOfIframes = allFrames.size();
        System.out.println("numberOfIframes = " + numberOfIframes);

        List<WebElement> allFrame = driver.findElements(By.tagName("frame"));
        int numberOfFrame = allFrame.size();
        System.out.println("numberOfFrame = " + numberOfFrame);

        WebDriver frame_1 = driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_1.html']")));
        frame_1.


        tearDown();
    }

}
