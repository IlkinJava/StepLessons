public class InstanceofTest {
    public static void main(String[] args) {
        /**
         * Конструктор базового класса, если он есть, всегда вызывается первым при создании любого объекта.
         * Instanceof руководствуется именно этим принципом, когда пытается определить, был ли объект А создан на основе класса Б.
         * Если конструктор базового класса вызван, значит никаких сомнений быть не может
         */
        Developer developer = new Developer();
        BackendDeveloper backendDeveloper = new BackendDeveloper();
        System.out.println(developer instanceof Employee);
        System.out.println(backendDeveloper instanceof Employee);
        System.out.println(developer instanceof BackendDeveloper);
        System.out.println(backendDeveloper instanceof Developer);
    }
}