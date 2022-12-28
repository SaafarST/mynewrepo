package Class12;

import org.openqa.selenium.By;

import static utils.BaseClass.*;


public class _04_UploadFiles {
    public static void main(String[] args) throws InterruptedException {

        setUp("https://the-internet.herokuapp.com/upload");

        /**
         * ==== How to Upload files using Selenium ======
         *  How do we upload files using Selenium?
         *  1. Specify file location - get full path of the file you are about to upload
         *  2. Locate web element for 'Choose file' button, and using sendKeys() method, send the location/full path of the file.
         *  3. Locate 'Upload' button element and click it to upload your file
         *
         *      This way we bypass the window popup, which is not supported by Selenium. (Just like we did with Authentication Alert)
         *
         */
        //Step 1: Specify file location - get full path of the file you are about to upload:
        String filePath = "/Users/tohirsaidzoda/Downloads/java_string_methods.pdf";

        //Step 2: Locate web element for 'Choose file' button, and using sendKeys() method, send the location/full path of the file:
        driver.findElement(By.id("file-upload")).sendKeys(filePath);

        //Step 3: Locate 'Upload' button element and click it to upload your file:
        driver.findElement(By.id("file-submit")).click();

        //Check whether upload was successful:
        String uploadStatus = driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
        if (uploadStatus.contains("Uploaded"))
        {
            System.out.println("File Upload successful!");
        }else {
            System.out.println("Upload failed");
        }

        Thread.sleep(1000);

        tearDown();

    }
}
