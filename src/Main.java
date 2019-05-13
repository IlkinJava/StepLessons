public class Main {
    public static void main(String[] args) {
        A.hello();
        B.hello();
        hello("Sabina");
        int[] arr = {4, 6, 7};
        System.out.println(arraySum(arr));
    }

    static void hello(String name) {
        System.out.println("Hello " + name);
    }

    static int arraySum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}
