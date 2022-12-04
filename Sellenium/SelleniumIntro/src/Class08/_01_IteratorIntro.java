package Class08;

import java.util.ArrayList;
import java.util.List;

public class _01_IteratorIntro {
    public static void main(String[] args) {
        List<Double> LdoubleList = new ArrayList<>();
        LdoubleList.add(9.99);
        LdoubleList.add((2.99));
        LdoubleList.add(1.00);
        LdoubleList.add(20.00);
        LdoubleList.add(2.98);
        LdoubleList.add(3.44);
        System.out.println(LdoubleList);
        System.out.println(LdoubleList.get(2));

    }
}
