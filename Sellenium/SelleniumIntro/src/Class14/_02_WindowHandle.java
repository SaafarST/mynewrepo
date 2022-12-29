package Class14;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

import static utils.BaseClass.*;

public class _02_WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://google.com");
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window = " + parentWindow);

        driver.switchTo().newWindow(WindowType.TAB);//opens new BLANK tab and switch focus to it
        driver.get("https://about.google/");

        driver.switchTo().newWindow(WindowType.TAB);//opens new BLANK tab and switch focus to it
        driver.get("https://store.google.com");


        driver.switchTo().newWindow(WindowType.TAB);//opens new BLANK tab and switch focus to it
        driver.get("https://ok.ru");

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Total tabs open: "+allWindows.size());

        Iterator<String> iterator = allWindows.iterator();
        while (iterator.hasNext()){
            String nextWindow = iterator.next();
            System.out.println(nextWindow);
            driver.switchTo().window(nextWindow);
            System.out.println(driver.getTitle());
        }


        //tearDown();

    }
}
