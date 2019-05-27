package enums;

import java.util.Arrays;

import static enums.WeekDays.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(WeekDays.values()));
        System.out.println("Day number MONDAY = " + MONDAY.getDay());
        System.out.println("Day number  TUESDAY = " + TUESDAY.getDay());
        System.out.println("Day number  WEDNESDAY = " + WEDNESDAY.getDay());
        System.out.println("Day number THURSDAY = " + THURSDAY.getDay());
        System.out.println("Day number FRIDAY = " + FRIDAY.getDay());
        System.out.println("Day number SATURDAY = " + SATURDAY.getDay());
        System.out.println("Day number SUNDAY = " + SUNDAY.getDay());
    }
}
