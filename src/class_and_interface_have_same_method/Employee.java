package class_and_interface_have_same_method;

public class Employee extends Person implements Named {
    /**
     *Если класс наследуется от класса в котором содержится метод с одним и тем же названием что в интерфейсе
     * то значение будет иметь метод суперкласса
     */
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.getCount());
    }
}