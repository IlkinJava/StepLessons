package try_with_resources;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
    public void test() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(n);
        } catch (InputMismatchException exception) {
            System.out.println("Exception catch");
            exception.printStackTrace();
        }
    }
}