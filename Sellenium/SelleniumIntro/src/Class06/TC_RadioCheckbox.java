package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

    public class TC_RadioCheckbox {
    private static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String cssYellow = "input[value='yellow']";
        String cssOrange = "input[value='orange']";
        driver.findElement(By.cssSelector(cssOrange)).click();
        driver.findElement(By.cssSelector(cssYellow)).click();

        List<WebElement> elements = driver.findElements(By.name("color"));//list of elements

        for(WebElement element:elements){
            if (element.isSelected()){
                System.out.println(element.getAttribute("value"));
            }
        }

        Thread.sleep(3000);
        driver.close();
    }
}
