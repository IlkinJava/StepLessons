package lambda;

import java.util.Comparator;
/**
        * Лямбда-выражение - это безымянный метод, который служит
        * для передачи поведения из одного места программы в другое
        * так, будто это данные.
        * Лямбда-выражения выглядят следующим образом: BinaryOperator<
        * Integer> add = (х, у) .... х + у.
        * Функциональным интерфейсом называется интерфейс с единственным
        * абстрактным методом; он используется в качестве
        * типа лямбда-выражения.
        */
public class LambdaExamples {

    public static void comparatorExample() {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        Comparator<String> lambdaComparator = (s1, s2) -> s1.length() - s2.length();

        Comparator<String> lambdaComparator2 = Comparator.comparingInt(String::length);

    }

    public static void ownInterfaceExample() {
        TestClass testClass = new TestClass();

        testClass.testLambda(new FunctionalInterfaceExample() {
            @Override
            public void test() {
                System.out.println("Без лямбда");
            }
        });

        testClass.testLambda(() -> System.out.println("С лямбда"));
    }

    public static void main(String[] args) {
        ownInterfaceExample();
    }
}