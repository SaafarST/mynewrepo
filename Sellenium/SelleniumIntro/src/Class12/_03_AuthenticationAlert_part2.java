package Class12;

import static utils.BaseClass.setUp;
import static utils.BaseClass.tearDown;


public class _03_AuthenticationAlert_part2 {
    public static void main(String[] args) throws InterruptedException {
        //setUp("https://the-internet.herokuapp.com/basic_auth");
        setUp("https://admin:admin@the-internet.herokuapp.com/basic_auth");



        Thread.sleep(1000);

        tearDown();

    }
}
