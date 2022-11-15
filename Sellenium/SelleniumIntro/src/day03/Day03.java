package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
        Thread.sleep(1000);
        driver.findElement(By.linkText("REGISTER")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstName")).sendKeys("John");
        Thread.sleep(100);
        driver.findElement(By.name("lastName")).sendKeys("Sick");
        Thread.sleep(100);
        driver.findElement(By.name("phone")).sendKeys("111222");
        Thread.sleep(100);
        driver.findElement(By.name("email")).sendKeys("JWick");
        Thread.sleep(100);
        driver.findElement(By.name("password")).sendKeys("jwick1122");
        Thread.sleep(100);
        driver.findElement((By.name("confirmPassword"))).sendKeys("jwick1122");
        Thread.sleep(100);
        driver.findElement(By.name("submit")).click();
        Thread.sleep(2500);
        driver.close();


        //driver.close();


    }
}
