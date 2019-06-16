package generics.generic_restrictions;

public class Test<T extends Employee> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void raiseSalary(T t, double byPercent) {
        double salary = t.getSalary();
        double raise = salary * byPercent / 100;
        salary += raise;
        t.setSalary(salary);
    }

    public static void main(String[] args) {
        Test<Developer> test = new Test<>();
        Developer dev = new Developer(1, "Ilkin", 1000, 500);
        test.raiseSalary(dev, 10);
        System.out.println(dev.getSalary());
        JavaDeveloper developer = new JavaDeveloper(2, "John", 1500, 300, 3);
        test.raiseSalary(developer, 10);
        System.out.println(developer.getSalary());
    }
}