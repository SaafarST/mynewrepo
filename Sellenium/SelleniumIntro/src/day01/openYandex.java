package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openYandex {
    public static void main(String[] args) {
        System.out.println("hello Aydin!");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://amazon.com");
        System.out.println("Title is "+webDriver.getTitle());
        System.out.println("URL is "+webDriver.getCurrentUrl());
        System.out.println(webDriver.getPageSource());

        webDriver.quit();
    }
}
