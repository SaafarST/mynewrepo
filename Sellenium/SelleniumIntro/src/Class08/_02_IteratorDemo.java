package Class08;

import java.util.ArrayList;
import java.util.List;

public class _02_IteratorDemo {
    public static void main(String[] args) {
        //Non-generic ArrayList
        List randomList = new ArrayList<>();
        randomList.add("Apple");
        randomList.add("ORange");
        randomList.add(28);
        randomList.add(53.44);
        randomList.add(true);
        randomList.add(4==6);
        randomList.add('C');

        System.out.println("randomList = " + randomList);

    }
}
