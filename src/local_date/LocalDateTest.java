package local_date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
    public static void main(String[] args) {
        System.out.println(test("16/06/2016"));
    }


    public static void minusPeriod() {
        LocalDate a = LocalDate.of(2014, 6, 30);
        LocalDate b = a.minus(Period.ofDays(100));
        System.out.println(b);
    }

    public static void format() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(formatter.format(date));
    }

    public static void parse() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        String date = "16/08/2016";

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
    }

    public static void defaultParse() {
        String date = "2016-08-16";

        //default, ISO_LOCAL_DATE
        LocalDate localDate = LocalDate.parse(date);

        System.out.println(localDate);
    }
    public static String test(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        DateTimeFormatter secondFormatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
        return secondFormatter.format(localDate);
    }
}