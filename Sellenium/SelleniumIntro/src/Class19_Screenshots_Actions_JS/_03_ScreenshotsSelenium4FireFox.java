package Class19_Screenshots_Actions_JS;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import utils.ConfigsReader;

import java.io.File;
import java.io.IOException;

import static utils.BaseClass.*;

public class _03_ScreenshotsSelenium4FireFox {
    public static void main(String[] args) {
        setUp("https://exelentersdet.com");


        // Login to the web application
        sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperties("username"));
        sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperties("password"));
        clickButWaitForClickability(driver.findElement(By.id("btnLogin")));

        /**
         *  In Selenium 4 we have two new methods for taking Screenshots.
         *  They are called:
         *      1. getScreenshotAs();
         *      2. getFullPageScreenshotAs();   <== this method is ONLY available with Firefox driver.
         *
         *      These methods are new to Selenium 4, and are not available in Selenium 3.
         *      Using these methods we can take screenshots in two different ways:
         *        1. Section-level screenshots, specific to particular web element of the page.
         *        2. Full-page screenshots, entire page.
         *
         */

        waitForVisibility(By.cssSelector("table[class='table hover'] td"));

        //2. getFullPageScreenshotAs();   <== this method is ONLY available with Firefox driver.
        File sourceFile = ((FirefoxDriver) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(sourceFile,new File("screenshots/dashboardFireFox1.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to take screenshot.");
        }

        tearDown();
    }
}
