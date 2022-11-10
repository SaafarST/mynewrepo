package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openOpera {
    public static void main(String[] args) {
        System.out.println("hello Aydin!");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://yandex.ru");
        System.out.println("URL is "+webDriver.getTitle());
        webDriver.quit();
    }
}
