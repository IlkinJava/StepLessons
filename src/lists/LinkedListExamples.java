package lists;

import java.util.LinkedList;

public class LinkedListExamples {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(7);

        System.out.println(list);
        list.remove();
        System.out.println(list);

        list.removeFirstOccurrence(7);
        System.out.println(list);

        list.add(11);
        System.out.println(list);

        list.addFirst(88);
        System.out.println(list);
        Integer integer = list.get(2);

        System.out.println(integer);


        System.out.println(list.indexOf(11));

        list.add(11);

        System.out.println(list.lastIndexOf(11));

        list.offerFirst(22);
        System.out.println(list);

        list.pollFirst();
        System.out.println(list);

        System.out.println(list.peekFirst());
    }
}