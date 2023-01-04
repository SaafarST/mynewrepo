package Class14;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import static utils.BaseClass.*;

public class _02_WindowHandle2 {
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
        allWindows.forEach(System.out::println);
        switchToWindow(allWindows,"Ok");

        List<String> windowList = new ArrayList<>(allWindows);



        tearDown();
    }

    public static void switchToWindow(Set<String> allWindows,String windowTitle){
        for (String window : allWindows) {
            String title = driver.switchTo().window(window).getTitle();
            System.out.println("title = " + title);
            if (title.contains(windowTitle)){
                System.out.println("Test is successful, title is: "+windowTitle);
                break;
            }
            else {
                System.out.println("Test is failed");
            }
        }
    }
}
