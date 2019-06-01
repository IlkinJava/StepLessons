package fizzbuzz;

public class FizzBuzzImpl1 implements FizzBuzz {
    @Override
    public void fizzBuzz(int[] arr) {
        for (int value : arr) {
            if (value % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (value % 3 == 0) {
                System.out.println("Fizz");
            } else if (value % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}