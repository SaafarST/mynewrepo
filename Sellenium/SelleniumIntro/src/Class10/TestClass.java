package Class10;

import utils.BaseClass;

public class TestClass extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        setUp();

        System.out.println(driver.getTitle());

        tearDown();
    }
}
