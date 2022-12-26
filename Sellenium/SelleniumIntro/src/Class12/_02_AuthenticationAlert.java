package Class12;
import static utils.BaseClass.*;


public class _02_AuthenticationAlert {
    public static void main(String[] args) throws InterruptedException {
        //setUp("https://httpbin.org/basic-auth/foo/bar");
        setUp("https://foo:bar@httpbin.org/basic-auth/foo/bar");



        Thread.sleep(1000);

        tearDown();

    }
}
