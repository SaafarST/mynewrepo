package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioDemo_01 {
    private static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String xPathMozilla = "//input[@name='browser'][2]";//css = input[value='Mozilla']
        driver.findElement(By.xpath(xPathMozilla)).click();

         boolean displayed = driver.findElement(By.xpath(xPathMozilla)).isDisplayed();
         boolean enabled = driver.findElement(By.xpath(xPathMozilla)).isEnabled();
         boolean selected = driver.findElement(By.xpath(xPathMozilla)).isSelected();

        System.out.println(displayed+" "+enabled+" "+selected);

        String xPathIE = "//input[@name='browser']";//css = input[value='Mozilla']

        boolean displayedIE = driver.findElement(By.xpath(xPathMozilla)).isDisplayed();
        boolean enabledIE = driver.findElement(By.xpath(xPathMozilla)).isEnabled();
        boolean selectedIE = driver.findElement(By.xpath(xPathMozilla)).isSelected();

        System.out.println(displayedIE+" "+enabledIE+" "+selectedIE);

        Thread.sleep(2000);
        driver.close();
    }
}
