package fizzbuzz;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 15};
        FizzBuzz firstRealization = new FizzBuzzImpl1();
        FizzBuzz secondRealization = new FizzBuzzImpl2();
        firstRealization.fizzBuzz(arr);
        secondRealization.fizzBuzz(arr);
    }
}
