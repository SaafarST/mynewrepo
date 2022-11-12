package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://amazon.com");
        String title = webDriver.getTitle();
        String amazonTitle = "Amazon.com. Spends less. Smiles more.";
        if(title.equals(amazonTitle)){
            System.out.println("Test passed.");
        }else {
            System.out.println("Test failed");
        }

        webDriver.close();
    }
}
