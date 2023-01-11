package Class15;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;

import static utils.BaseClass.*;

public class _07_PageLoadTimeout {
    public static void main(String[] args) {
        //setUp("https://exelenter.com");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));

        Instant startTime = Instant.now();
        System.out.println("startTime = " + startTime);
        driver.get("https://exelenter.com");
        
        Instant endTime = Instant.now();
        System.out.println("endTime = " + endTime);

        Duration pageLoadTime = Duration.between(startTime, endTime);
        System.out.println("pageLoadTime = " + pageLoadTime);

        System.out.println(driver.getTitle());
        driver.close();

    }
}
