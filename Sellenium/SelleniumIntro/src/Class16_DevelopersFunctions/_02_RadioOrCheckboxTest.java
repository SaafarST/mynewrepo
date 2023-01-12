package Class16_DevelopersFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
public class _02_RadioOrCheckboxTest {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
        List<WebElement> colors = driver.findElements(By.name("color"));
        List<WebElement> listOfBrowsers = driver.findElements(By.name("browser"));
        String expectedValue = "green";
        String expectedBrowser = "mozilla";
        clickRadioOrCheckbox(colors,expectedValue);
        clickRadioOrCheckbox(listOfBrowsers,expectedBrowser);

        tearDown();
    }

}
