public class InheritanceTest {
    public static void main(String[] args) {
        Developer developer = new Developer(1, "Sabina", "Software Developer", 800, 200);
        System.out.println(developer.getSalary());
        System.out.println(developer);
        Employee employee = new Employee(Employee.getNextId(),"Rashad","Junior Developer",700);
        Employee emp = new Employee(Employee.getNextId(),"Elshan","Junior Developer",700);
        Developer dev = new Developer(Employee.getNextId(),"Ayxan","Senior Developer",4500,500);
        System.out.println(employee);
        System.out.println(emp);
        System.out.println(dev);
    }
}