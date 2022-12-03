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
    static String expectedText = "Home";
    private static String url = "https://exelenter.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // window users add '.exe' at the end
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        Thread.sleep(3000);

        //Git and get all links on Exelenter website:
        List<WebElement> linksOnEx = driver.findElements(By.tagName("a"));


        int linkSize = linksOnEx.size();
        System.out.println("Количество ссылок на сайте "+url+" равно =" + linkSize);

        System.out.println("Тест: найти ссылу на 'Главная страница'="+expectedText);
        System.out.println("Если нет, то тест не пройден.");

        //Количество ссылок на 'Главная страница'
        int count = 0;

        //Функция для нахождения ссылок на 'Главная страница' и считания количество этих ссылок
        for(WebElement link:linksOnEx){
            if (!link.getText().isEmpty()&&link.getText().equals(("Home"))){
            System.out.println("Тест пройден, ссылка на 'Главная страница' существует.");
            System.out.println("Текст сылки на 'Главная страница' "+link.getText());
            count++;}
        }
        System.out.println("Количество ссылок на 'Главная страница' = " + count);

        Thread.sleep(2000);
        driver.close();

    }
}
