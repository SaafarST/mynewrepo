package Class15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;

public class _07_PageLoadTimeout {
    public static void main(String[] args) {
        //setUp("https://exelenter.com");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));

        Instant startTime = Instant.now();
        System.out.println("startTime = " + startTime);

        try {
            driver.get("https://google.com");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Too slow to load, add more time!");
        }
        Instant endTime = Instant.now();
        System.out.println("endTime = " + endTime);

        Duration pageLoadTime = Duration.between(startTime, endTime);
        System.out.println("pageLoadTime = " + pageLoadTime.toMillis());

        System.out.println(driver.getTitle());

        driver.close();

    }
}
