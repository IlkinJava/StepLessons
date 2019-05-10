public class CycleLessonExample {
    public static void main(String[] args) {

    }

    public static void example1() {
        int i = 0;
        while (i < 5) {
            i++;
            System.out.println(i);
        }
    }

    public static void example2() {
        int i = 0;
        while (i > 5) {
            i++;
            System.out.println(i);
        }
        System.out.println(i);
    }

    public static void example3() {
        while (true) {
            System.out.println("infinity");
        }
    }

    public static void example4() {
        int i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i > 10);
    }

    public static void example5() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void example6() {
        int i = 0;
        for (; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void example7() {
        for (int i = 1, j = 3; i < 5 & j > 0; i++, --j) {
            System.out.println("i = " + i + " j = " + j);
        }
    }

    public static void example8() {
        int[] numbers = {3, 2, 1};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void example9() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            if (i >= 2) break;
            i++;
        }
    }

    public static void example10() {
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }

    public static void example11() {
        int i;
        one:
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) continue one;
                System.out.printf("i=%d j=%d \n", i, j);
            }
        }
    }
}
