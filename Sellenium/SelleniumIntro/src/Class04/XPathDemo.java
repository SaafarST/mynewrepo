package Class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    private static String URL="https://exelentersdet.com";
    public static void main(String[] args) {
        System.setProperty("webdriver/chrome/driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

    }
}
