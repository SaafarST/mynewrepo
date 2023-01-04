package Class14;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static utils.BaseClass.*;

public class _03_WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://demoqa.com/browser-windows");
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

        int count = 1;
        Iterator<String> iterator = allWindows.iterator();
        while (iterator.hasNext()){
            String nextWindow = iterator.next();
            driver.switchTo().window(nextWindow);
            String title = driver.getTitle();

            System.out.println("Page"+count+" title:"+title);
            count++;

            List<String> windowList = new ArrayList<>();
            windowList.add(nextWindow);
            if (title.contains("OK")){
                driver.switchTo().window(nextWindow);
                System.out.println("Windows is found and switched to "+title);
                break;
            }
        }

        tearDown();
    }
}
