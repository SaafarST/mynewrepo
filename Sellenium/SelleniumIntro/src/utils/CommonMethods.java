package utils;

import org.openqa.selenium.WebElement;

import java.util.Set;

import static utils.BaseClass.driver;

public class CommonMethods {

    /**
     * Method will switch focus to next window/tab based on the window title/name
     * @param windowTitle
     */
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

    public static void sendText(WebElement element, String value){
        element.sendKeys(value);
    }
}
