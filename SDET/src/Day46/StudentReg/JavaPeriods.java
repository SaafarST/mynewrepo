package Day46.StudentReg;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class JavaPeriods {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1991,3,3);
        LocalDate oldareu = today.minusYears(birthday.getYear()).minusMonths(birthday.getMonthValue()).minusDays(birthday.getDayOfMonth());
        System.out.println(oldareu);
        //using period class

        Period period = Period.between(birthday,today);
        System.out.println(period);

        int year = period.getYears();
        int month = period.getMonths();
        int days = period.getDays();
        System.out.println(year+" "+month+" "+days);


    }
}
