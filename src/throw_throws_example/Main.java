package throw_throws_example;

public class Main {
    public static char getCharFromString(String str, int index) throws IllegalArgumentException,
            IndexOutOfBoundsException {
        if (index < 0)
            throw new IllegalArgumentException();
        return str.toCharArray()[index];
    }

    public static void main(String[] args) {
        try {
            System.out.println(getCharFromString("hello", 20));
        } catch (IllegalArgumentException e) {
            System.out.println("Индекс не может быть меньше нуля");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Вы вышли за пределы массива");
        }
    }
}
