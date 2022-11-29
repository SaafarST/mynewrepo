package Class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioDemo_01 {
    private static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
