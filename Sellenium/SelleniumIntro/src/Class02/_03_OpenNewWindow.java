package Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_OpenNewWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        Thread.sleep(2000);
        webDriver.switchTo().newWindow(WindowType.WINDOW);
        webDriver.navigate().to("https://vk.ru");
        Thread.sleep(3000);
        webDriver.navigate().refresh();
        Thread.sleep(2000);
        //webDriver.close();
        webDriver.quit();
    }
}
