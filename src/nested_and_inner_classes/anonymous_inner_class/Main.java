package nested_and_inner_classes.anonymous_inner_class;

public class Main {
    public static void main(String[] args) {
        /**
         * Анонимный внутренний класс не имеет имени.Если мы не хотим создавать класс для
         * реализации одного метода или же объект этого класса будет использоваться
         * всего один раз то лучше использовать их
         */
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating ...");
            }
        };
        ableToEat.eat();
        /**
         * При создании анонимного внутреннего класса происходит то же самое что и внизу
         *
        class Animal implements AbleToEat {
            @Override
            public void eat() {
                System.out.println("Animal is eating...");
            }
        }*/
    }
}
