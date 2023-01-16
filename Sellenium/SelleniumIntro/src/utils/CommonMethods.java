package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

    /**
     * Method selects radio button or checkbox is enabled and is not already selected, then clicks on it.
     *
     * @param radioOrCheckbox List of WebElements for dropdown or radio buttons
     * @param expectedValue   String
     */
    public static void clickRadioOrCheckbox(List<WebElement> radioOrCheckbox, String expectedValue){
        for (WebElement element : radioOrCheckbox) {
            String actualValue = element.getAttribute("value");
            if (element.isEnabled() && !element.isSelected() && expectedValue.equalsIgnoreCase(actualValue)){
                element.click();
                break;
            }
        }
    }

    public static void clickRadioOrCheckbox(WebElement radioOrCheckbox){
        if (radioOrCheckbox.isEnabled() && !radioOrCheckbox.isSelected()){
            radioOrCheckbox.click();
        }
    }

    /**
     * Method selects from dropdown or multi-select by text value.
     *
     * @param listOfElements  list of WebElement
     * @param expectedElement String
     */
    public static void selectDdValue(List<WebElement> listOfElements,String expectedElement){
        for (WebElement element : listOfElements) {
            String actualText = element.getText();
            if (actualText.equalsIgnoreCase(expectedElement))
            {
                element.click();
                break;
            }
        }
    }

    /**
     * Method selects from a dropdown by visible text.
     *
     * @param element       WebElement
     * @param expectedElement String
     */
    public static void selectDdValue(WebElement element,String expectedElement){
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equals(expectedElement)){
                select.selectByVisibleText(expectedElement);
                break;
            }
        }
    }

    /**
     * Method will select a dropdown or multi-select by index.
     *
     * @param element WebElement
     * @param index   int
     */
    public static void selectDdValue(WebElement element,int index){
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        if (options.size()<index){
            try {

                throw new IndexOutOfBoundsException(index);
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                System.out.printf("Your number is bigger than "+(options.size())+", please enter a number between 1 and "+(options.size()));
            }

        }else {
            select.selectByIndex(index);
        }
    }

    public static void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public static void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    /**
     * Method will wait for an element, but this is a static wait, please use with caution.
     *
     * @param second int
     */
    public static void waitInSeconds(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sendAlertText(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}
