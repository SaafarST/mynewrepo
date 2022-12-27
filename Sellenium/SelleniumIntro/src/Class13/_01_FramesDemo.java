package Class13;

import org.openqa.selenium.By;

import static utils.BaseClass.*;

public class _01_FramesDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("http://www.uitestpractice.com/");
        driver.findElement(By.xpath("//*[contains(text(),'Switch to')]")).click();
        String text = driver.findElement(By.xpath("//p[contains(text(),'Testing')]")).getText();
        System.out.println("text = " + text);

        driver.switchTo().frame(0);
        driver.findElement(By.id("name")).sendKeys("Sdet");

        Thread.sleep(1000);

        tearDown();
    }

}
