package nested_and_inner_classes;

/**
 * Существует 2 вида вложенных(nested) классов 1.статические 2.не статические
 * Называют их 1.статический вложенный класс (static nested class) и
 * 2.Внутренние классы (inner class)
 * Свою же очередь внутренние классы так же могут быть локальными,анонимными
 */
public class ElectroCar {
    private int id;

    public ElectroCar(int id) {
        this.id = id;
    }

    /**
     * Внутренний класс(inner) он имеет доступ к private полям внешнего класса,
     * Также внутренний класс может иметь все модификаторы доступа,в то время как внешний
     * может быть public и default
     */
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + "is starting");
        }
    }

    /**
     * Статический вложенный класс(static nested class)
     * имеет доступ только к статическим полям внешнего класса
     */
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging");//к полю id обратится не сможем
        }
    }

    /**
     * Локальный внутренний класс обычно находятся в теле метода  и может быть abstract или final
     * имеет доступ к private полям внешнего класса,к финальным локальным переменным(final)
     * или же к фактически конечным локальным переменным(effectively final)
     */
    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        final int x = 0;// final
        int y = 6;// effectively final

        class SomeClass {
            public void someMethod() {
                System.out.println(id);
                System.out.println(x);
                System.out.println(y);
            }
        }
        System.out.println("Electrocar " + id + " is starting ...");
    }
}
