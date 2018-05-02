package tests;

import java.time.LocalDate;
import java.time.Period;

public class DateCounter {
    public static void main(String[] args){
        LocalDate start = LocalDate.of(2016, 07, 16);
        LocalDate now = LocalDate.now();
        Period period = start.until(now);
        System.out.println(period.getYears() + " year(s) and " + period.getMonths() + " month(s)");
    }
}
