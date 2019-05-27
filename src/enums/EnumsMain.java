package enums;

import java.util.Arrays;

import static enums.Size.*;

public class EnumsMain {

    public static void main(String[] args) {

        Size s = EXTRA_LARGE;

        Size s1 = Enum.valueOf(Size.class, "SMALL");

        Size[] values = Size.values();

        System.out.println(s1);
        System.out.println(s.getAbbreviation());
        System.out.println(Arrays.toString(values));
        System.out.println(EXTRA_LARGE.ordinal());
        System.out.println(LARGE.toString());
        System.out.println(MEDIUM.compareTo(SMALL));
    }
}