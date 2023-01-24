package Class18;
import org.apache.batik.css.engine.value.css2.SrcManager;
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

    public static void loginToExelenter(String username, String password){
        sendText(driver.findElement(By.id("txtUsername")),username);
        sendText(driver.findElement(By.id("txtPassword")),password);
        click(driver.findElement(By.id("btnLogin")));
    }
    public static String addNewEmployee(String firstName,String middleName, String lastName){
        click(driver.findElement(By.id("menu_pim_viewPimModule")));//find PIM and click on it
        click(driver.findElement(By.cssSelector("input#btnAdd")));//Find Add btn and click);
        sendText(driver.findElement(By.id("firstName")),firstName);//set name to John
        sendText(driver.findElement(By.id("middleName")), middleName); //set middle name to Voltaire
        sendText(driver.findElement(By.id("lastName")), lastName); //set  surname to Bell
        String employeeID = getEmployeeID(driver.findElement(By.id("employeeId")),"value");//Store employeeID
        click(driver.findElement(By.id("btnSave")));//Click Save btn to add employee
        return employeeID;
    }
    public static List<WebElement> getList(String element){
        return driver.findElements(By.cssSelector(element));
    }
    public static boolean verifyEmployee(String employeeID, List<WebElement> listOfIDs){

        boolean status = false;
            for (WebElement ID : listOfIDs) {
                if (ID.getText().equals(employeeID)) {
                    System.out.println("An employee with ID of "+ID.getText()+" is on the list.");
                    status = true;
                    break;
                }
            }
        if(status == false){
            System.out.println("An employee with ID of "+employeeID+" is not on the list.");
        }
        return status;
    }
    public static String getEmployeeID(WebElement element, String attribute){
        return element.getAttribute(attribute);
    }
    public static boolean clickEmployee(String employeeID, List<WebElement> listOfIDs, List<WebElement> listOfCBs){

        boolean status = false;
        try{
        for (int i = 0; i < listOfIDs.size(); i++) {
            if (listOfIDs.get(i).getText().equals(employeeID)) {
                System.out.println("An employee with ID of "+listOfIDs.get(i).getText()+" is on the list, and employee is clicked.");
                listOfCBs.get(i).click();
                waitInSeconds(5);
                status = true;
                break;
            }
        }
        }catch (Exception e){
            e.printStackTrace();
        }

        if(status == false){
            System.out.println("An employee with ID of "+employeeID+" is not on the list.");
        }
        return status;
    }

    public static void main(String[] args) {

        setUp("https://www.exelentersdet.com");

        loginToExelenter("Admin","Exelent2022Sdet!");

        click(driver.findElement(By.id("menu_pim_viewPimModule")));//Navigate to PIM

        String employeeID = addNewEmployee("Jack", "Voltaire", "Bell");//add new user and return ID

        click(driver.findElement(By.id("menu_pim_viewEmployeeList")));//Navigate to employee list to check user added or not

        int pageNumber = 0;
        boolean employeeFound = false;
        String expectedID = "343";

        while (pageNumber < 6 && employeeFound == false) {
            List<WebElement> listOfIDs = getList("tbody tr td:nth-child(2)");
            List<WebElement> listOfCBs = getList("tbody tr td:nth-child(1)");
            WebElement nextBtn = driver.findElement(By.xpath("(//*[contains(text(),'Next')])[1]"));

            verifyEmployee(employeeID, listOfIDs);

            if (clickEmployee(expectedID, listOfIDs, listOfCBs)) {
                waitInSeconds(4);
                WebElement deleteBtn = driver.findElement(By.id("btnDelete"));
                click(deleteBtn);
                WebElement dialogDeleteBtn = driver.findElement(By.id("dialogDeleteBtn"));//Dialogue delete Btn
                click(dialogDeleteBtn);
                System.out.println("Employee with ID of " + expectedID + " is successfully removed from the list.");
                employeeFound = true;
                break;
            } else {
                try {
                    if (pageNumber < 5) {
                        System.out.println("Employee not found on list #" + (pageNumber+1) + ", switching to the next page.");
                        System.out.println(" ================ ");
                        click(nextBtn);
                        pageNumber++;
                    } else {
                        System.out.println("An employee with ID of " + expectedID + " does not exist.");
                        pageNumber++;
                    }
                }catch (Exception e)
                {   e.printStackTrace();
                }
            }
        }

//    while (status == false && maxNumberOfNextPage < 5) {
//
//        List<WebElement> selectElements = driver.findElements(By.cssSelector("tbody tr td:nth-child(1)"));//Get all select elements
//        List<WebElement> listOfIDs = driver.findElements(By.cssSelector("tbody tr td:nth-child(2)"));//Get all list of ID's
//        WebElement deleteBtn = driver.findElement(By.id("btnDelete"));
//
//        WebElement dialogDeleteBtn = driver.findElement(By.id("dialogDeleteBtn"));//Dialogue delete Btn
//        WebElement nextBtn = driver.findElement(By.xpath("(//*[contains(text(),'Next')])[1]"));
//
//        //Check element if it exists in the given list of elements:
//        for (int i = 0; i < listOfIDs.size(); i++) {
//            if (listOfIDs.get(i).getText().equals(employeeID)) {
//                selectElements.get(i).click();
//                click(deleteBtn);
//                click(dialogDeleteBtn);//click ok!
//                status = true;
//                break;
//            }
//        }
//        if (status == false){
//        click(nextBtn);}
//        maxNumberOfNextPage++;
//    }
    //Re-check element if it exists in the given list of elements:
//    for (int i = 0; i < listOfIDs.size(); i++) {
//        if (listOfIDs.get(i).getText().equals(employeeID)){
//            System.out.println("Element has not been deleted!");
//            break;
//        }
//    }
    //System.out.println(checkForValue(listOfIDs, "102342"));

    tearDown();
}
    public static WebElement get_ith_Element( List<WebElement> list, int i){
    return list.get(i);
}


    public static int checkForValue( List<WebElement> list, String value){
        int n_thElement = Integer.parseInt(null);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().equals(value)){
                n_thElement = i;
                break;
            }
        }
        return n_thElement;
    }
    //public static int

}
