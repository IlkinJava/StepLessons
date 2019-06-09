package comparator_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Comparator<Employee> nameLength = Comparator.comparingInt(employee -> employee.getName().length());
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(1, "John", 22, 1800);
        employees[1] = new Employee(2, "Alice", 27, 2800);
        employees[2] = new Employee(3, "Dan", 22, 1800);
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).thenComparing(nameLength));
        System.out.println(Arrays.toString(employees));
    }
}