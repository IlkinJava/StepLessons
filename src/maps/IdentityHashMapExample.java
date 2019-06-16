package maps;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<>();
        /**
         * HashMap для сравнения ключей использует equals() и поэтому при попытке добавить
         * ключи с одиннаковыми значениями,значение не добавляэтся в мэпку
         */
        hashMap.put("a", "a");
        hashMap.put(new String("a"), "a");//не добавилось
        /**
         * IdentityHashMap для сравнения ключей использует == поэтому каждый новый объект
         * с одиннаковыми значениями разный
         */
        identityHashMap.put("a", "a");
        identityHashMap.put(new String("a"), "a");//добавилось
        identityHashMap.put(new String("a"), "a");//опять добавилось
        System.out.println(hashMap);
        System.out.println(identityHashMap);

    }
}
