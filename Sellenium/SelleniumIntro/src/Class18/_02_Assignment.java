package Class18;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
public class _02_Assignment {
/**
 * HW: Test Case: Add and then Delete added employee from the table
 * 1. Open Chrome Browser
 * 2. Navigate to URL www.exelentersdet.com
 * 3. Login to the website (Credentials are in your Properties file)
 * 4. Add an employee
 * 5. Verify employee has been added (By retrieving Employee ID).
 * 6. Go to Employee list
 * 7. Delete added employee (By employee ID - ID is unique, could be multiple employees with same name)
 * 8. Quit the browser
 */

public static void main(String[] args) {

    setUp("https://www.exelentersdet.com");

    sendText(driver.findElement(By.id("txtUsername")),"Admin");
    sendText(driver.findElement(By.id("txtPassword")),"Exelent2022Sdet!");
    click(driver.findElement(By.id("btnLogin")));

    click(driver.findElement(By.id("menu_pim_viewPimModule")));//find PIM and click on it

    WebElement addBtn = driver.findElement(By.cssSelector("input#btnAdd"));//Find Add btn
    click(addBtn);

    sendText(driver.findElement(By.id("firstName")),"John");//set name to John
    sendText(driver.findElement(By.id("middleName")), "Voltaire"); //set middle name to Voltaire
    sendText(driver.findElement(By.id("lastName")), "Bell"); //set  surname to Bell

    String employeeID = getAttribute(driver.findElement(By.id("employeeId")),"value");//Store employeeID
    System.out.println("Employee ID " + employeeID);

    WebElement saveBtn = driver.findElement(By.id("btnSave"));
    click(saveBtn);//Click Save btn to add employee

    click(driver.findElement(By.id("menu_pim_viewEmployeeList")));//Navigate to employee list again

    WebElement nextBtn = driver.findElement(By.xpath("(//*[contains(text(),'Next')])[1]"));

    List<WebElement> selectElements = driver.findElements(By.cssSelector("tbody tr td:nth-child(1)"));//Get all select elements
    List<WebElement> listOfIDs = driver.findElements(By.cssSelector("tbody tr td:nth-child(2)"));//Get all list of ID's

    //Check element if it exists in the given list of elements:
    for (int i = 0; i < listOfIDs.size(); i++) {
        if (listOfIDs.get(i).getText().equals(employeeID)){
            selectElements.get(i).click();
            break;
        }
    }

    WebElement deleteBtn = driver.findElement(By.id("btnDelete"));
    click(deleteBtn);

    WebElement dialogDeleteBtn = driver.findElement(By.id("dialogDeleteBtn"));//Dialogue delete Btn
    click(dialogDeleteBtn);//click ok!

    //Re-check element if it exists in the given list of elements:
    for (int i = 0; i < listOfIDs.size(); i++) {
        if (listOfIDs.get(i).getText().equals(employeeID)){
            System.out.println("Element has not been deleted!");
            break;
        }
    }
    tearDown();
}
public static WebElement getithElement( List<WebElement> list, int i){
    return list.get(i);
}

}
