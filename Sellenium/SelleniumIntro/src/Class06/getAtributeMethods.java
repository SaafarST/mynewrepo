package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAtributeMethods {
    private static String url ="https://www.exelentersdet.com";
    private static String user = "Tester";
    private static String pwd = "test";

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String byAttribute_Name = "txtUsername";
        WebElement username = driver.findElement(By.name(byAttribute_Name));
        String id = username.getAttribute("id");

        /*String byAttr_ID = "txtPassword";
        WebElement password = driver.findElement((By.id(byAttr_ID)));
        System.out.println("id "+password);*/



        Thread.sleep(2000);
        driver.close();

    }

}

