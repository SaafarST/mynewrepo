package Class19_Screenshots_Actions_JS;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import static utils.BaseClass.*;

public class _07_ActionsDragAndDrop {
    public static void main(String[] args) {
        setUp("https://demoqa.com/droppable");

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);

        //1st way:
        actions.clickAndHold(draggable).moveToElement(droppable).release().perform();
        waitInSeconds(1);

        driver.navigate().refresh();
        waitInSeconds(1);

        //2nd way:
        draggable = driver.findElement(By.id("draggable"));
        droppable = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(draggable,droppable).perform();

        waitInSeconds(1);
        tearDown();
    }
}
