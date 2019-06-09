package finally_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyClass {

    public void test() {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println(n);
        } catch (InputMismatchException exception) {
            System.out.println("Exception catch");
            exception.printStackTrace();
        } finally {
            sc.close();
            System.out.println("Scanner closed");
        }
    }

    public static void main(String[] args) {
        FinallyClass finallyClass = new FinallyClass();
        finallyClass.test();
    }
}