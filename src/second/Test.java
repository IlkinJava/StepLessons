package second;


import first.Test2;

public class Test {
    public static void main(String[] args) {
        /** не сможем обратится к методу defaultTest() в классе Test1 ,т.к eгo область видимости default
        (ограничен пакетом гдe находится сам класс)
        */
//        Test1.defaultTest();   ошибка
        Test2.publicTest();
    }
}
