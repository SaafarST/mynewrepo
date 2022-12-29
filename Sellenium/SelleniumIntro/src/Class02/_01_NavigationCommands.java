package Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com");
        Thread.sleep(2000);

        webDriver.navigate().to("https://yahoo.com");
        Thread.sleep(2000);

        webDriver.navigate().back();
        Thread.sleep(2000);

        webDriver.navigate().forward();
        Thread.sleep(2000);

        webDriver.quit();
        webDriver.close();

    }
}
