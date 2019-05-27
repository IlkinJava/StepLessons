package immutuable;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(18, "John", new Date());
        Date d = student.getDate();
        d.setTime(0);
        System.out.println(student);
        //дата не обнулится
        // Student{age=18, name='John', date=Sat Jan 05 15:51:01 GMT+04:00 2019}
    }
}