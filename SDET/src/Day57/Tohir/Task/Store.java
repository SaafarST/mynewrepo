package Day57.Tohir.Task;

import Day57.Tohir.Task.TVs.SmartTV;
import Day57.Tohir.Task.Tablets.iPad;

public class Store {
    static iPad ipad;
    static SmartTV smartTV;

    static {
        iPad ipad = new iPad("iPad Air",599);
    }
    static {
        SmartTV smartTV = new SmartTV("TV",499);
    }

    public static void main(String[] args) {
        System.out.println(ipad);

    }
}
