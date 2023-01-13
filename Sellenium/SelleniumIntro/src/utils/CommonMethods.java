package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
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

    /**
     * This method send key as a text to given element
     * @param element
     * @param value
     */
    public static void sendText(WebElement element, String value){
        element.sendKeys(value);
    }

    /**
     * This method clicks to given element
     * @param element
     */
    public static void click(WebElement element){
        element.click();
    }

    public static WebDriverWait waitForElement(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.ExPLICIT_WAIT_TIME));
        return wait;
    }
    public static void waitForClickability(WebElement element){
        waitForElement().until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitForVisibility(WebElement element){
        waitForElement().until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitForVisibility(By by){
        waitForElement().until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void clickButWaitForClickability(WebElement element){
        waitForClickability(element);
        element.click();
    }
    public static void clickButWaitForVisibility(WebElement element){
        waitForVisibility(element);
        element.click();
    }

    public static void clickRadioOrCheckbox(List<WebElement> radioOrCheckbox, String expectedValue){
        for (WebElement element : radioOrCheckbox) {
            String actualValue = element.getAttribute("value");
            if (expectedValue.equalsIgnoreCase(actualValue)){
                element.click();
                break;
            }
        }
    }

    public static void dropDown(List<WebElement> listOfElements,String expectedElement){
        for (WebElement element : listOfElements) {
            String actualText = element.getText();
            if (actualText.equalsIgnoreCase(expectedElement))
            {
                element.click();
                break;
            }
        }
    }
}
