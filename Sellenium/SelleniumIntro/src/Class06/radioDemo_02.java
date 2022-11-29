package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioDemo_02 {
    private static String url = "https://formstone.it/components/checkbox/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String cssThree = "input[value='3']";//or input#checkbox-3
        WebElement checkBoxThree = driver.findElement(By.cssSelector(cssThree));
         boolean checkBoxThreeEnabled = checkBoxThree.isEnabled();
        System.out.println(checkBoxThreeEnabled);

        
        Thread.sleep(2000);
        driver.close();
    }
}
