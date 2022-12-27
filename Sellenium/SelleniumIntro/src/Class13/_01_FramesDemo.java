package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _01_FramesDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("http://www.uitestpractice.com/");
        driver.findElement(By.xpath("//*[contains(text(),'Switch to')]")).click();
        String text = driver.findElement(By.xpath("//p[contains(text(),'Testing')]")).getText();
        System.out.println("text = " + text);

        //1. By index:
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("Sdet");

        Thread.sleep(1000);
        textBox.clear();
        textBox.sendKeys("QA Engineer");

        driver.switchTo().defaultContent();
        String text1 = driver.findElement(By.xpath("//p[contains(text(),'Testing')]")).getText();
        System.out.println("text = " + text1);

        //2. By ID or Name:
        driver.switchTo().frame("iframe_a");
        textBox.clear();
        textBox.sendKeys("Hi");



        tearDown();
    }

}
