package _01_Methods;

import java.util.Set;

import static utils.BaseClass.driver;

public class _02_SwitchTo {

    public static void switchToWindow(String windowTitle, Set<String> windows) {
        for (String windowOrTab : windows) {
            String title = driver.switchTo().window(windowOrTab).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Window is found! Page Title: " + driver.getTitle() +  " URL: " + driver.getCurrentUrl());
                //break;
            }
        }
    }

    public static void switchToWindow(String windowTitle) {
        Set<String> windows = driver.getWindowHandles();
        for (String windowOrTab : windows) {
            String title = driver.switchTo().window(windowOrTab).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Window is found! Page Title: " + driver.getTitle() +  " URL: " + driver.getCurrentUrl());
                break; // with 'break' included, If I search windowTitle by 'Google' only first will print, without 'break' ALL titles that contain 'Google' will print
            }
        }
    }
}
