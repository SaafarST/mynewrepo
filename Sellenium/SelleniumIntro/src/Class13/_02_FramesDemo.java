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
        //Get all links:
        System.out.println("allLinks = " + allLinks.size());

        //Get all iframes:
        List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
        int numberOfIframes = allFrames.size();
        System.out.println("numberOfIframes = " + numberOfIframes);

        //Get all frames:
        List<WebElement> allFrame = driver.findElements(By.tagName("frame"));
        int numberOfFrame = allFrame.size();
        System.out.println("numberOfFrame = " + numberOfFrame);

        //Get to first frame with css and name:
        WebDriver frame_1 = driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_1.html']")));
        frame_1.findElement(By.name("mytext1")).sendKeys("Frame One");

        //Set to default:
        driver.switchTo().defaultContent();

        //Get to second frame with css and name:
        WebDriver frame_2 = driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_2.html']")));
        frame_2.findElement(By.name("mytext2")).sendKeys("Frame Two");

        //Set to default:
        driver.switchTo().defaultContent();

        //Get to 5th frame
        WebDriver frame_5 = driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_5.html']")));
        frame_5.findElement(By.name("mytext5")).sendKeys("Frame Five");

        tearDown();
    }

}
