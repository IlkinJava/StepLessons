package try_catch;

public class Main {
    static Object object;
//    public static void foo() {
//        System.out.println(object.toString());
//        System.out.println(1 / 0);
//    }
//    public static void foo() {
//        try {
//            System.out.println(object.toString());
//            System.out.println(1 / 0);
//        } catch (NullPointerException e) {
//            System.out.println("Объект равен null");
//        } catch (ArithmeticException e) {
//            System.out.println("На ноль делить нельзя");
//        }
//    }
    public static void foo() {
        try {
            System.out.println(object.toString());
        } catch (NullPointerException e) {
            System.out.println("Объект равен null");
        }
        try {
            System.out.println(1 / 0);
        }catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
    }
    public static void main(String[] args) {
        foo();
    }
}
