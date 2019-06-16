package maps;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Ilkin");
        map.put(3, "Sabina");
        map.put(2, "Gunay");

        System.out.println(map.get(2));
        map.replace(2, "Nailya");
        System.out.println(map.get(2));
        System.out.println(map.values());

        map.put(5, "Emin");

        map.computeIfAbsent(5, key -> key + ", " + "Emin");
        System.out.println(map.get(5));


        map.computeIfAbsent(8, key -> key + ", " + "Elshan");
        System.out.println(map.get(8));

        map.put(10, "John");

        map.merge(10, " Snow", (oldVal, newVal) -> oldVal + newVal);

        System.out.println(map.get(10));

        map.merge(22, "Snow", (oldVal, newVal) -> oldVal + newVal);

        System.out.println(map.get(22));
    }
}
