import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        test19();
    }

    static void example1() {
        Pattern p = Pattern.compile("Java");
        Matcher m = p.matcher("Java 8,Java 11");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
    }

    static void example2() {
        Pattern p = Pattern.compile("1\\+1=2");
        Matcher m = p.matcher("1+1=2");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
    }

    static void example3() {
        Pattern p = Pattern.compile("[3-5a-zA-Z%]");
        Matcher m = p.matcher("tesT%2");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static void example4() {
        Pattern p = Pattern.compile("gr[ae]y");
        Matcher m = p.matcher("gray");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static void example5() {
        Pattern p = Pattern.compile("a[^u]");
        Matcher m = p.matcher("Java is the best!");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static void example6() {
        Pattern p = Pattern.compile("[^x]");
        Matcher m = p.matcher("text");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static void example7() {

        //   \\d - [0-9] , \\w - [a-zA-Z0-9] , \\s - пробел или табуляция
        // их отрицаниями будут \\D \\W \\S


        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher("tesT 123");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static void example8() {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher("1221");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static void example9() {
        Pattern p = Pattern.compile("\\bis\\b");
        Matcher m = p.matcher("This is Java");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static boolean example10(String userNameString) {
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

    static boolean emailRegex(String email) {
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";
        return email.matches(regex);
    }

    public static boolean test11(String testString) {
        Pattern p = Pattern.compile(".+\\.(com|ua|ru|az|org);");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static String test12(String input) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("#");
    }

    static void test13() {
        Pattern p = Pattern.compile("^b");
        Matcher m = p.matcher("abc");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static void test14() {
        Pattern p = Pattern.compile("b$");
        Matcher m = p.matcher("Java");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static void test15() {
        Pattern p = Pattern.compile("cat|dog");
        Matcher m = p.matcher("I love my dog");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static void test16() {
        Pattern p = Pattern.compile("colou?r");
        Matcher m = p.matcher("color colour");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static void test17() {
        Pattern p = Pattern.compile("Aug(ust)?");
        Matcher m = p.matcher("August Aug");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static void test18() {
        Pattern p = Pattern.compile("Feb(ruary)? 23(rd)?");
        Matcher m = p.matcher("February 23rd,February 23,Feb 23rd,Feb 23");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + "");
        }
    }

    static void test19() {
        System.out.println("Java SE".replaceAll("Java (SE|EE)", "$1 version"));
        System.out.println("Java SE".replaceAll("Java (SE|EE)", "$0 version"));
    }
}
