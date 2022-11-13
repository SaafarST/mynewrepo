package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ok.ru");
        Thread.sleep(2000);
        driver.findElement(By.name("st.email")).sendKeys("test@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("field_password")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Log in to OK")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
