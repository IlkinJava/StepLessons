public class EqualsAndHashcodeTest {
    public static void main(String[] args) {
        /**
         * Если мы переопределим в своём классе equals() и hashcode()
         */
        Employee employee = new Employee(3, "Nailya", "Junior Java Developer", 1000);
        Employee employee1 = new Employee(3, "Nailya", "Junior Java Developer", 1000);

        System.out.println(employee.hashCode());
        System.out.println(employee1.hashCode());
        System.out.println(employee.hashCode() == employee1.hashCode()); //они одинаковы -> true
        System.out.println(employee.equals(employee1));//true
        /**
         * Если мы не переопределим в своём классе equals() и hashcode() то у нас будут методы глобального суперкласса
         * Object
         */
        Employee e = new Employee(1, "Ilkin", "Java Developer", 2500);
        Employee e1 = new Employee(1, "Ilkin", "Java Developer", 2500);
        System.out.println(e.hashCode());
        System.out.println(e1.hashCode());
        System.out.println(e.hashCode() == e1.hashCode()); //они одинаковы -> false
        System.out.println(e.equals(e1)); //false
    }
}
