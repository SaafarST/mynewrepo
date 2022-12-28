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
        String formTitle = driver.findElement(By.xpath("(//*[contains(text(),'Form ')])[1]")).getText();

        System.out.println("Form Title = " + formTitle);

        tearDown();
    }
}
