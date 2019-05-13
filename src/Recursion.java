public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    private static String recursivelyIterator(int n) {
        if (n == 1) {
            return "1";
        }
        return recursivelyIterator(n - 1) + " " + n;
    }

    private static int numberSum(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + numberSum(n / 10);
        }
    }
}