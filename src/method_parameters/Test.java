package method_parameters;

import composition.Employee;
import composition.Passport;

/**
 * Таким образом, в Java для передачи объектов не применяется вызов по ссылке.
 * Вместо этого ссылки на объекты передаются по значению. Ниже поясняется, что может и чего он не может метод делать со своими параметрами.
 * • Метод не может изменять параметры примитивных типов (т.е. числовые и логические значения).
 * • Метод может изменять состояние объекта, передаваемого в качестве параметра.
 * • Метод не может делать в своих параметрах ссылки на новые объекты
 */
public class Test {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
        //----
        Employee x = new Employee("Alice", 1500, new Passport());
        Employee y = new Employee("Bob", 2500, new Passport());
        employeeSwap(x, y);
        System.out.println(x);
        System.out.println(y);
// Тест 3: методы могут изменять состояние объектов,передаваемых в качестве параметров
        Employee.tripleSalary(x);
        System.out.println(x.getSalary());
    }

    //Тест 1: методы не могут видоизменять числовые параметры
    static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(a);
        System.out.println(b);
    }

    //Тест 2: методы не могут присоединять новые объекты объектным параметрам
    static void employeeSwap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}