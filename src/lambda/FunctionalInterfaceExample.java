package lambda;

/**
 * Лямбда-выражение можно предоставить всякий раз,когда ожидается объект класса,
 * реализующего интерфейс с единственным абстрактным методом. Такой интерфейс называется функциональным
 */
@FunctionalInterface
public interface FunctionalInterfaceExample {
    void test();
}