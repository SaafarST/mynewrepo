package Class19_Screenshots_Actions_JS;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigsReader;
import utils.Constants;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static utils.BaseClass.*;
public class _01_ScreenshotsDemo {
    public static void main(String[] args) {
        setUp("https://exelentersdet.com");


        // Login to the web application
        sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperties("username"));
        sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperties("password"));
        clickButWaitForClickability(driver.findElement(By.id("btnLogin")));

        /**
         *  In Selenium 3, we use 'TakesScreenshot' interface to take snapshots of web pages.
         *  For copying file from source (webpage) to destination (your local folder), we can use either:
         *      1. FileUtils.copyFile(sourceFile, destinationFile)  <== from Commons IO, an Apache Library
         *      2. FileHandler.copy(sourceFile, destinationFile)    <== from Selenium Library
         *
         *      Method used is:
         *         - getScreenshotAs()
         */
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.ExPLICIT_WAIT_TIME));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("flot-overlay")));
        waitForPresenceOfElement(By.className("flot-overlay"));

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile,new File("dashboard2.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Screenshot is not taken");
        }

        waitInSeconds(1);

        tearDown();
    }
}
