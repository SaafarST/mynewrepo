package _01_Methods;

import java.util.Set;

import static utils.BaseClass.driver;

public class _01_Finders {
    public static void switchToWindow(Set<String> allWindows, String windowTitle){
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
