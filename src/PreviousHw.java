import java.util.Scanner;

public class PreviousHw {
    public static void main(String[] args) {
        palindrome();
    }

    static void palindrome() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstInt = n;
        int reversedInt = 0;
        int remainder;
        while (n > 0) {
            remainder = n % 10;
            reversedInt = 10 * reversedInt + remainder;
            n = n / 10;
        }
        if (firstInt == reversedInt) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static void fibonacciNumbers() {
        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.print(a + " " + b);
        while (c < 1000) {
            System.out.print(" " + c);
            a = b;
            b = c;
            c = b + a;
        }
    }
    static void simpleNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        System.out.println(2);
        for (int i = 3; i <= n; i += 2) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) System.out.println(i);
            isPrime = true;
        }
    }
    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.print("\n");
        }
    }
}
