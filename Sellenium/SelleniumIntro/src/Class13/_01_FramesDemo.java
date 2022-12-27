package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        Thread.sleep(2000);

        //2. By ID or Name:
        driver.switchTo().frame("iframe_a");
        textBox.clear();
        textBox.sendKeys("Hi");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        //3.By Frame Web Element
        WebElement frame = driver.findElement(By.cssSelector("iframe[src='/Demo.html']"));
        driver.switchTo().frame(frame);
        textBox.clear();
        textBox.sendKeys("Frame By WebElement");
        Thread.sleep(2000);


        tearDown();
    }

}
