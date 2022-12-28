package Class13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.BaseClass.*;
public class _04_NestedFrames {
    public static void main(String[] args) {
        setUp("http://ui.vision/demo/webtest/frames/");
        WebDriver frame_3 = driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_3.html']")));
        frame_3.findElement(By.name("mytext3")).sendKeys("Frame Three");
        WebDriver frameInsideFrame = driver.switchTo().frame(driver.findElement(By.cssSelector("body > center > iframe")));
        String formTitleText = driver.findElement(By.xpath("(//*[contains(text(),'Form ')])[2]")).getText();

        System.out.println("Form Title = " + formTitleText);

        //Switch to frame 4:

        driver.switchTo().defaultContent();
        WebDriver frame_2 = driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_4.html']")));
        frame_2.findElement(By.name("mytext4")).sendKeys("Frame Four");

        tearDown();
    }
}
