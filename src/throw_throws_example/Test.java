package throw_throws_example;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    static void validate(int age) {
        try {
            if (age < 0) throw new ArithmeticException("Invalid age");
            else System.out.println("Valid input");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

     void readFile() throws IOException {
        FileInputStream fis = new FileInputStream("src/abc.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.println((char) i);
        }
        fis.close();
    }

    public static void main(String[] args) {
        Test t = new Test();
        try {
            t.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}