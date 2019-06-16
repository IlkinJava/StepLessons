package sets;

import java.util.EnumSet;

import static sets.Weekday.*;

public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet<Weekday> always = EnumSet.allOf(Weekday.class);
        EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);
        EnumSet<Weekday> workday = EnumSet.range(MONDAY, FRIDAY);
        EnumSet<Weekday> mwf = EnumSet.of(MONDAY, WEDNESDAY, FRIDAY);
        workday.add(SUNDAY);
        workday.remove(TUESDAY);
        System.out.println(workday);
    }
}
