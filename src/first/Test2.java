package first;

public class Test2 {
    public static void main(String[] args) {
        Test1.defaultTest();
        privateTest();
    }

    public static void publicTest() {
        System.out.println("Public Test");
    }

    private static void privateTest() {
        System.out.println("Private Test");
    }
}
