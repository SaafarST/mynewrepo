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

        driver.switchTo().newWindow(WindowType.TAB);//opens new BLANK tab and swotch focus to it
        driver.get("https://about.google/");


        tearDown();

    }
}
