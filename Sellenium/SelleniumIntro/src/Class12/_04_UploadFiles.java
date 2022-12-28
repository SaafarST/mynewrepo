package Class12;

import static utils.BaseClass.setUp;
import static utils.BaseClass.tearDown;


public class _04_UploadFiles {
    public static void main(String[] args) throws InterruptedException {

        setUp("https://the-internet.herokuapp.com/upload");


        Thread.sleep(1000);

        tearDown();

    }
}
