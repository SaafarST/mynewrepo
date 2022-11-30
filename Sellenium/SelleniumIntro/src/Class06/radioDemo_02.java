package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioDemo_02 {
    private static String url = "https://formstone.it/components/checkbox/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);


        String cssOne = "input#checkbox-1";
        WebElement checkBoxOne = driver.findElement(By.cssSelector(cssOne));
         boolean checkBoxOneSelected = checkBoxOne.isSelected();
        System.out.println("check box one is selected = "+ checkBoxOneSelected);

        String cssTwo = "input#checkbox-2";// xPath (//input[@class='fs-checkbox-element'])[2]
         WebElement checkBocTwo = driver.findElement(By.cssSelector(cssTwo));
         boolean checkBocTwoEnabled = checkBocTwo.isEnabled();
        System.out.println("checkBocTwo is Enabled = " + checkBocTwoEnabled);

        String cssThree = "input[value='3']";//or input#checkbox-3
        WebElement checkBoxThree = driver.findElement(By.cssSelector(cssThree));
        boolean checkBoxThreeEnabled = checkBoxThree.isEnabled();
        System.out.println("checkBoxThree is Enabled = " + checkBoxThreeEnabled);

        Thread.sleep(2000);
        driver.close();
    }
}
