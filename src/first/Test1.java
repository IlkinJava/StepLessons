package first;

public class Test1 {
    public static void main(String[] args) {
        Test2.publicTest();
//        Test2.privateTest(); не можем обратится к данному методу т.к  его модификатор доступа private
//        (ограничен классом где он создан)
    }

    static void defaultTest() {
        System.out.println("Default Test");
    }
}
