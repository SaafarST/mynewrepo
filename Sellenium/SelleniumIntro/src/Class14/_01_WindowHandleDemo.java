package Class14;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

import static utils.BaseClass.*;
public class _01_WindowHandleDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://the-internet.herokuapp.com/windows");
        /**
         *  How to handle new TABS and new WINDOWS in Selenium?
         *          *  We have two methods for handling new tabs/windows.
         *          *      1. getWindowHandle();    ==> handles main window only
         *          *      2. getWindowHandles();   ==> handles ALL windows (or tabs)
         */

        String mainWindowTitle = driver.getTitle();
        System.out.println("Main Window Title = " + mainWindowTitle);

        String windowHandle = driver.getWindowHandle();
        System.out.println("windowHandle = " + windowHandle);

        driver.findElement(By.linkText("Click Here")).click();
        driver.findElement(By.linkText("Click Here")).click();
        driver.findElement(By.linkText("Click Here")).click();
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> allWindows = driver.getWindowHandles();
        allWindows.forEach(System.out::println);
        int allOpenWindows = allWindows.size();
        System.out.println("All tabs currently open = " + allOpenWindows);

        //Iterators:
        Iterator<String> iterator = allWindows.iterator();
        String mainWindows = iterator.next();
        String childWindow = iterator.next();
        System.out.println("mainWindows = " + mainWindows);
        System.out.println("childWindow = " + childWindow);

        System.out.println("=====Before ===== =====");

        String WindowTitle = driver.getTitle();
        System.out.println("Window Title = " + WindowTitle);
        WebDriver childwindow = driver.switchTo().window(childWindow);

        System.out.println("=====After ===== =====");
        System.out.println("Window Title = " + driver.getTitle());
        Thread.sleep(1000);
        driver.close();//The child window is closed
        //driver.close();returns NoSuchWindowException because child window was closed before.
        Thread.sleep(1000);
        driver.switchTo().window(mainWindows);
        driver.close();


        //driver.switchTo().window(windowHandles.)

        tearDown();

    }
}
