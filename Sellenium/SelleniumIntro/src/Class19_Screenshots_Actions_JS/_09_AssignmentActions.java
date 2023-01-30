package Class19_Screenshots_Actions_JS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static utils.BaseClass.*;
public class _09_AssignmentActions {

            /**  HW: Actions Class
 *      1. Go to exelenter.com
 *      2. Hover over the 'Courses+' menu, and a sub-menu dropdown will open
 *      3. From the sub-menu select 'Java-sdet' and click on it
 *      4. On the Java SDET page, grab the title 'SDET Automation Course'
            *      5. Open a new tab and navigate to Google homepage on this newly opened tab
 *      6. On the Google search box, type "Exelenter" +  Title (concatenate), which you copied
    from the exelenter sdet page  (Step 4)
 *      7. Press Enter, and you will be taken to the Google Search result page
 *      8. From the Search Results, loop through until you find a link with the title 'Exelenter' click on it
 *      9. Now you should end up on the exelenter.com page again.
 *      10. Quit the browser.
 */
    public static void main(String[] args) {

        setUp("https://www.exelenter.com");
        Actions actions = new Actions(driver);

        WebElement courseMenu = driver.findElement(By.xpath("(//span[text()='Courses'])[1]"));
        actions.moveToElement(courseMenu).perform();
        waitInSeconds(1);
        actions.scrollToElement(driver.findElement(By.xpath("(//span[@class='ct-menu-item'])[7]"))).click().perform();
        waitInSeconds(1);


        tearDown();


    }
}
