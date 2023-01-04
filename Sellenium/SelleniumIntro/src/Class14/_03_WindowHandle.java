package Class14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

import static utils.BaseClass.*;

public class _03_WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://demoqa.com/browser-windows");

        String driverTitle = driver.getTitle();
        System.out.println("Driver title = " + driverTitle);
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window = " + parentWindow);

        for (int i = 0; i <3; i++) {
            //driver.findElement(By.id("tabButton")).click();//Open in a new Tab
            driver.findElement(By.id("windowButton")).click();//Open in an new Window
            Thread.sleep(1000);
        }

        Set<String> allWindows = driver.getWindowHandles();
//        for (String Window : allWindows) {
//            driver.switchTo().window(Window);
//            driver.get("https://google.com");
//            System.out.println("Window ID: "+Window+", window title "+driver.getTitle());
//        }
        Iterator<String> iterators = allWindows.iterator();
        while (iterators.hasNext()){
            String next = iterators.next();
            driver.switchTo().window(next);
            driver.get("https://google.com");
            System.out.println("Window ID: "+next+", window title "+driver.getTitle());

        }
        Thread.sleep(2000);


        tearDown();
    }
}
