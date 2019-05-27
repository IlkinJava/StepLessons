public class Polymorphism {
    public static void main(String[] args) {
        Employee e = new Developer(Employee.getNextId(), "John", "Junior Developer", 1000, 200);
        e.raiseSalary(10);

        Employee[] employees = new Employee[3];
        employees[0] = new Developer(Employee.getNextId(), "Rashad", "Front-end developer", 800, 200);
        employees[1] = new BackendDeveloper(Employee.getNextId(), "Ilkin", "Back-end developer",
                2500, 500, "Java");
        employees[2] = new Employee(Employee.getNextId(), "Alan", "HR", 800);

        for (Employee emp : employees) {
            System.out.println(emp);
            emp.raiseSalary(10);
        }
    }
}
