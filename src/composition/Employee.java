package composition;

public class Employee {
    private String name;
    private double salary;
    private Passport passport;

    public Employee() {
    }

    public Employee(String name, double salary, Passport passport) {
        this.name = name;
        this.salary = salary;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method salary= " + x.getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", passport=" + passport +
                '}';
    }
}
