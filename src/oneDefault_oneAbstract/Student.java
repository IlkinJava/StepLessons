package oneDefault_oneAbstract;

public class Student implements Person, Named {
    /**
     * Если класс реализует 2 интерфейса с одиннаковыми методами но в одном из этих интерфейсов задана реализация
     * по умолчанию то нам обязательно придется переопределить этот метод в нашем классе
     */
    @Override
    public String getName() {
        return Named.super.getName();
    }
//    @Override
//    public String getName() {
//        return "Mine method";
//    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
    }
}