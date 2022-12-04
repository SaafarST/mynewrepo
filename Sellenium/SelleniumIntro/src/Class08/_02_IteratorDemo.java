package Class08;

import java.util.ArrayList;
import java.util.Iterator;
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

        System.out.println("---For Loop---");
        for (int i = 0; i < randomList.size(); i++) {
            System.out.print(randomList.get(i)+"-");
        }

        System.out.println("\n---Enhanced Loop---");
        for (Object obj:randomList){
            System.out.print(obj+"-");
        }

        System.out.println("\n---Iterator---");
        Iterator iterator = randomList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"-");
        }
    }
}
