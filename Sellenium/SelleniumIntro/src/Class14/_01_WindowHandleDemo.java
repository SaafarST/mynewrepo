package Class14;
import org.openqa.selenium.By;

import java.util.Set;

import static utils.BaseClass.*;
public class _01_WindowHandleDemo {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/windows");
        /**
         *  How to handle new TABS and new WINDOWS in Selenium?
         *          *  We have two methods for handling new tabs/windows.
         *          *      1. getWindowHandle();    ==> handles main window only
         *          *      2. getWindowHandles();   ==> handles ALL windows (or tabs)
         *
         *          */

        String mainWindowTitle = driver.getTitle();
        System.out.println("Main Window Title = " + mainWindowTitle);

        String windowHandle = driver.getWindowHandle();
        System.out.println("windowHandle = " + windowHandle);

        driver.findElement(By.linkText("Click Here")).click();
        driver.findElement(By.linkText("Click Here")).click();
        driver.findElement(By.linkText("Click Here")).click();
        driver.findElement(By.linkText("Click Here")).click();
        
        String WindowTitle = driver.getTitle();
        System.out.println("Window Title = " + WindowTitle);

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("windowHandles = " + windowHandles);
        int allOpenWindows = windowHandles.size();
        System.out.println("All tabs currentky open = " + allOpenWindows);

        //driver.switchTo().window(windowHandles.)

        tearDown();

    }
}
