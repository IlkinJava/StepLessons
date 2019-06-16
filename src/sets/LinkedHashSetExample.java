package sets;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(5);
        set.add(1);
        set.add(3);
        System.out.println(set);
        System.out.println(set.contains(3));
        set.remove(5);
        System.out.println(set);
        set.forEach(System.out::println);
        set.clear();
        System.out.println(set);
    }
}
