package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * TC 4.3: Print visible links from the Exelenter Homepage
 *      1. Open the Chrome browser
 *      2. Go to Exelenter Website
 *      3. Iterate through the links until you find "Enroll Now"
 *      4. Once expected keyword is found, print it and exit
 *      5. Close the browser
 */
public class FindSpecificLink {
    static String expectedText = "Enroll Now";
    private static String url = "https://exelenter.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // window users add '.exe' at the end
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> linksOnEx = driver.findElements(By.tagName("a"));

        int linksize = linksOnEx.size();
        System.out.println("linksize = " + linksize);

        for(WebElement link:linksOnEx){
            System.out.println(link.getText());
        }


        Thread.sleep(2000);
        driver.close();

    }
}
