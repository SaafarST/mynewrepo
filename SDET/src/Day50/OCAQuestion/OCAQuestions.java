package Day50.OCAQuestion;

import java.time.LocalDate;
import java.time.Month;

public class OCAQuestions {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.AUGUST,3);
        date.plusDays(40);
        date.plusMonths(3);
        System.out.println(date.getYear()+" "+date.getMonth()+" "+date.getDayOfMonth());
    }
}
