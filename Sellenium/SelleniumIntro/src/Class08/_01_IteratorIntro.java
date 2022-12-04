package Class08;

import java.util.ArrayList;
import java.util.Iterator;
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
        System.out.println(LdoubleList.get(5));

        System.out.println("---For Loop---");
        for (int i = 0; i < LdoubleList.size(); i++) {
            System.out.println(LdoubleList.get(i));
            System.out.println("Using doubleValue method: "+LdoubleList.get(i).doubleValue());
            System.out.println("Using intValue method: "+LdoubleList.get(i).doubleValue());
        }

        System.out.println("---Enhanced Loop---");
        for(double dlist:LdoubleList){
            System.out.println(dlist);
        }

        System.out.println("---Iterator Loop---");
        Iterator<Double> doubleIterator = LdoubleList.iterator();
        while (doubleIterator.hasNext()){
            System.out.println(doubleIterator.next());
        }


    }
}
