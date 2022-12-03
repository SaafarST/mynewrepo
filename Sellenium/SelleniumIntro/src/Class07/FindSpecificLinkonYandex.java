package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindSpecificLinkonYandex {
    static String expectedText = "Tohir";
    private static String url = "https://google.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // window users add '.exe' at the end
        WebDriver driver = new ChromeDriver();
        driver.get(url);

       //Найти Поиск в Яндекс
        String cssShort = "body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";
        WebElement findWindow = driver.findElement(By.cssSelector(cssShort));

        //внести текст "Мария шарапова"
        findWindow.sendKeys("Мария шарапова");
        driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b")).submit();

        Thread.sleep(7000);
        driver.close();

    }
}
