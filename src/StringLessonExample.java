import java.time.LocalDate;
import java.util.Date;

public class StringLessonExample {
    public static void main(String[] args) {

    }

    static void example1() {
        String name = "John";
        String surname = new String("Snow");
        System.out.println(name);
        System.out.println(surname);
    }

    static void example2() {

        String value = String.valueOf(3);
        System.out.println(value);
    }

    static void example3() {
        String name = "John";
        char c = name.charAt(2);
        System.out.println(c);
    }

    static void example4() {
        String firstName = "John";
        String lastName = "Snow";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
        System.out.println(firstName.concat(" " + lastName));
        System.out.println(firstName + " " + lastName);
    }

    static void example5() {
        String test = "Java";
        boolean isContain = test.contains("av");
        System.out.println(isContain);
    }

    static void example6() {
        String str = "Starbucks";
        boolean isStarted = str.startsWith("Star");
        boolean isEnd = str.endsWith("Star");
        System.out.println(isStarted);
        System.out.println(isEnd);
    }

    static void example7() {
        String test = "      test ";
        System.out.println(test);
        System.out.println(test.trim());
    }

    static void example8() {
        String str = "Hello";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }

    static void example9() {
        String test = "Hello";
        int index = test.indexOf('e');
        System.out.println(index);
        int lastIndex = test.lastIndexOf('l');
        System.out.println(lastIndex);
    }

    static void example10() {
        String str = "Hello World";
        System.out.println(str.substring(4));
        System.out.println(str.substring(1, 4));
    }

    static void example11() {
        String str = "Hello";
        System.out.println(str.replace('l', 'L'));
    }

    static void example12() {
        String name = "John";
        String lastName = "Snow";
        System.out.println(name.equals(lastName));
    }

    static void example13() {
        String str = "Hi,Students";
        String[] strings = str.split(",");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    static void example14() {
//        StringBuffer s = "test"; owibka kompilyacii
        StringBuffer sb = new StringBuffer("test");
        sb.append('-').append("test");
        System.out.println(sb);
        sb.append(true);
        System.out.println(sb);
        sb.append(1);
        System.out.println(sb);
    }

    static void example15() {
        StringBuffer sb = new StringBuffer("I Java!");
        sb.insert(2, "love");
        System.out.println(sb);
    }

    static void example16() {
        StringBuffer sb = new StringBuffer("palindrome");
        sb.reverse();
        System.out.println(sb);
    }

    static void example17() {
        StringBuffer sb = new StringBuffer("I do not like Java!");
        sb.delete(2, 8);
        System.out.println(sb);
    }

    static void example18() {
        //stroki polucennie kontankatenaciey strokovix literalov v pul strok ne pomewaetsa
        String t = "t";
        String cat1 = "ca" + t;
        System.out.println(cat1);
        String cat2 = "cat";
        System.out.println(cat1 == cat2);
    }

    static void example19() {
        String text = "sum=" + 1 + 2;
        System.out.println(text);
        String test = "sum=" + (1 + 2);
        System.out.println(test);
        String test2 = 1 + 2 + " = 3";
        System.out.println(test2);
    }

    static void example20() {
        String text1 = "Java";
        String text2 = "Java";
        System.out.println(text1 == text2);
        System.out.println(text1.equals(text2));
    }

    static void example21() {
        String text1 = new String("Java");
        String text2 = new String("Java");
        System.out.println(text1 == text2);
        System.out.println(text1.equals(text2));
    }

    static void example22() {
        String str = new String("Java");
        System.out.println(str.concat("Love"));
        System.out.println(str);
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.append("Love"));
        System.out.println(sb);
    }
}
