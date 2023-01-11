package Class15;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static utils.BaseClass.*;

public class _07_PageLoadTimeout {
    public static void main(String[] args) {
        //setUp("https://exelenter.com");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        tearDown();
    }
}
