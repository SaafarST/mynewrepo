package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.google.com");
        String title = webDriver.getTitle();
        System.out.println("Title is "+title);
        System.out.println("URL is "+webDriver.getCurrentUrl());
        webDriver.quit();
    }
}
