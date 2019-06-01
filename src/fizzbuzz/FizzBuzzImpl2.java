package fizzbuzz;

public class FizzBuzzImpl2 implements FizzBuzz {
    @Override
    public void fizzBuzz(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                if (arr[i] % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (arr[i] % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}