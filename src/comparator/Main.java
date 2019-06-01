package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator comparator = new LengthComparator();
        System.out.println(comparator.compare("Test", "SecondTest"));

        String[] friends = {"Peter", "Alan", "Dan"};
        Arrays.sort(friends, comparator);
        System.out.println(Arrays.toString(friends));

        Integer[] array = {1, 7, 4};
        Arrays.sort(array, comparator);
        System.out.println(Arrays.toString(array));
    }
}