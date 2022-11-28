package Class05.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.SecureRandom;

public class someCommandsInSellenium {
    private static String url ="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
    private static String user = "Tester";
    private static String pwd = "test";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String cssUsername = "input#ctl00_MainContent_username";//xPath = //input[contains(@id, 'username')]
        WebElement username = driver.findElement(By.cssSelector(cssUsername));
        Thread.sleep(2000);
        username.sendKeys("test");
        Thread.sleep(2000);
        username.clear();
        Thread.sleep(2000);
        username.sendKeys(user);

        String cssPassword = "input#ctl00_MainContent_password";//or input[type='password']
        WebElement password = driver.findElement(By.cssSelector(cssPassword));
        Thread.sleep(2000);
        password.sendKeys(pwd);
        Thread.sleep(2000);

        String cssLogin = "input[type='submit']";//or input.button
        WebElement loginButton = driver.findElement(By.cssSelector(cssLogin));
        loginButton.click();
        Thread.sleep(2000);

        String xPathWbOrderLogo = "//ul[@id]/preceding-sibling::h1";
        WebElement webOrdersLogo = driver.findElement(By.xpath(xPathWbOrderLogo));
        boolean logoDisplayed = webOrdersLogo.isDisplayed();
        if (logoDisplayed){
            System.out.println("Logo is displayed, test case passed");
        }else {
            System.out.println("Logo is not displayed, test case failed");
        }

        String cssLogged_in = "div.login_info";
        WebElement loggedInUser = driver.findElement(By.cssSelector(cssLogged_in));
        String loggedInUserText = loggedInUser.getText();

        if (loggedInUserText.contains(user)){
            System.out.println("Authorized user is able to login successfully. Test Passed.");
        } else {
            System.out.println("Authorized user is NOT able to login successfully. Test Failed.");
        }

        System.out.println(loggedInUserText);
        Thread.sleep(2000);
        driver.close();

    }
}
