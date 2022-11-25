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

        String xPathCOntainsByText = "//a[contains(text(),'Welcome Admin')]";
        String xPathContainsByText01 = "//a[contains(text(),'Logout')]";
        String xPathContainsByAttribute = "//a[contains(@class,'panel')]";

        String xPathByParent = "//div[@id='welcome-menu']//a";

        String xPathStartwith_0 = "//a[starts-with(text(),'Log')]";//xPath startswith function by text
        String xPathStartswith_text = "//a[starts-with(text(),'Welcome')]";//xPath startswith function by text

        String xPathStartwith_attribute_byID = "//a[starts-with(@id,'wel')]";//xPath startswith function by attribute
        String xPathStartwith_attribute_byClass = "//a[starts-with(@class,'panel')]";//xPath startswith function by attribu

        driver.findElement(By.xpath(absolutexPath)).sendKeys("Admin");//Set name to Admin
        driver.findElement(By.xpath(xPathpassword)).sendKeys("Exelent2022Sdet!");//Set password
        driver.findElement(By.xpath(xPathLogin)).click();//Click to Login button

        driver.findElement(By.xpath(xPathStartwith_attribute_byID));//Use start-with function by attribute to find ID
        //driver.findElement(By.xpath(xPathStartswith_text)).click();

        Thread.sleep(100);

        driver.findElement(By.xpath(xPathContainsByText01)).click();

        //driver.findElement(By.xpath(xPathByParent)).click();

        Thread.sleep(3000);

        driver.close();
    }
}
