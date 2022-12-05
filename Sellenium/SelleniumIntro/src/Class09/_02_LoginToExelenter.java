package Class09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class _02_LoginToExelenter {
    public static WebDriver driver;
    public static void main(String[] args) throws IOException, InterruptedException {

        String filePath = System.getProperty("user.dir")+"/configs/configuration.properties";
        FileInputStream fis = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fis);

        final String browser = properties.getProperty("browser");
        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
        }

        Thread.sleep(2000);
        driver.close();
    }
}
