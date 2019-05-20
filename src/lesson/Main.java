package lesson;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Ilkin", "Java Developer", 2500);
        Employee[] employees = new Employee[2];
        employees[0] = e;
        employees[1] = new Employee(2, "Sabina", "Junior Java Developer", 800);

        for (Employee emp : employees) {
            emp.raiseSalary(10);
            emp.print();
        }
//        System.out.println(Arrays.toString(employees));
    }
}