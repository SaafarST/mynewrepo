package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findAllLinks {
    private static String url = "https://amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // window users add '.exe' at the end
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks = " + allLinks.size());

        int count = 0;
        for(WebElement link:allLinks){
            if (!link.getText().isEmpty()&&!link.getText().isBlank()){
            System.out.println(link.getText());
            count++;}

        }
        System.out.println("Number of links with text: "+count);
        Thread.sleep(2000);
        driver.close();
    }
}
