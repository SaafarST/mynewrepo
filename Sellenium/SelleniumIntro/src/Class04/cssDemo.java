package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssDemo {
    private static String URL="https://exelentersdet.com";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        String cssAdmin = "input[name='txtUsername']";//or input#txtUsername
        driver.findElement(By.cssSelector(cssAdmin)).sendKeys("Admin");

        String cssPassword = "input#txtPassword";
        driver.findElement(By.cssSelector(cssPassword)).sendKeys("Exelent2022Sdet!");

        Thread.sleep(2000);

        String cssLogin = "input#btnLogin";//or input[id^='btn'] or input.button
        // locate and click login button
//        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        driver.findElement(By.cssSelector(cssLogin)).submit();
        Thread.sleep(2000);

        String cssWelcomeAdmin = "a[class$='Trigger']";
        // In order to verify we are logged in, we locate and click on the 'Welcome Admin' - top right corner of the dashboard.
        driver.findElement(By.cssSelector(cssLogin)).click();
        Thread.sleep(2000);

        // We locate and click on the Logout button.
//        driver.findElement(By.xpath("//div[@id='welcome-menu']//a")).click();
        //Another way, using Starts-with:
        String cssLogout = "#welcome-menu a";
        driver.findElement(By.cssSelector(cssLogout)).click();

        Thread.sleep(2000);
        driver.close();

    }
}
