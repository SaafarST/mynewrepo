package Class14;

import static utils.BaseClass.*;

public class _03_WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://demoqa.com/browser-windows");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window = " + parentWindow);



        //tearDown();
    }
}
