package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    private static String URL="https://exelentersdet.com";
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        String absolutexPath = "/html/body/div/div/div/div/div[2]/form/div[2]/input";
        String relativexPath = "//input[@name='txtUsername']";
        String absolutexPathChrome = "/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[2]/input";
        String realtivexPathChrome = "//*[@id=\"divUsername\"]";
        String xPathpassword = "//*[@id=\"txtPassword\"]";
        String xPathLogin = "//input[@value='LOGIN']";
        driver.findElement(By.xpath(absolutexPath)).sendKeys("Admin");
        driver.findElement(By.xpath(xPathpassword)).sendKeys("Exelent2022Sdet!");
        driver.findElement(By.xpath(xPathLogin)).click();
        Thread.sleep(3000);
        //driver.close();
    }
}
