package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioDemo_03 {
    private static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String xPathBrwsers = "//input[@name='browser']";
        List<WebElement> browsers = driver.findElements(By.xpath(xPathBrwsers));

        int browserCount = browsers.size();
        System.out.println("browserCount = " + browserCount);
        int count = 0;
        for (int i = 0; i < browserCount; i++) {
          String browser = browsers.get(i).getAttribute("value");
            System.out.println(browser);
            count++;
            System.out.println("count = " + count);
        }
        System.out.println("*************************");

        for (WebElement element:browsers){
            System.out.println(element.getAttribute("value"));
        }
        System.out.println("*************************");

        for (WebElement element:browsers){
        if(element.isEnabled()&& !element.isSelected()){
            System.out.println("element = " + element.getAttribute("value"));
        }
        }

        System.out.println("*************************");
        for(WebElement element:browsers){
            if(element.getAttribute("value")=="Mozilla"){
                System.out.println(element);
            }
        }

        Thread.sleep(2000);
        driver.close();
    }
}
