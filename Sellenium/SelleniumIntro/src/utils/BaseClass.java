package utils;

//NOTE: THIS CLASS IS USED TO LAUNCH AND QUIT THE BROWSER

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    public static WebDriver driver;

    public static void setUp() {

        ConfigsReader.loadProperties(Constants.CONFIGURATION_FILEPATH);

        switch (ConfigsReader.getProperties("browser").toLowerCase()) {
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
            }
            case "firefox" -> {
                System.setProperty("webdriver.msedgedriver.driver", "drivers/gecko.exe");
                driver = new FirefoxDriver();
            }
            default -> throw new RuntimeException("Browser is not imported");
        }

        driver.get(ConfigsReader.getProperties("url"));
    }
    public static void tearDown(){
        if(driver!= null){
        driver.quit();}
    }
}
