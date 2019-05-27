package immutuable;

import java.util.Date;

/**
 * Immutable класс представляет собой ряд требований описанные ниже
 */
final class Student { //1.Класс должен быть final
    private int age; //2.Поля должны быть private
    private String name;
    private Date date;

    public Student(int age, String name, Date date) {
        this.age = age;
        this.name = name;
        this.date = date;
    }
    //3.Класс не должен иметь setter-ы
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
/*4.Если в классе содержится изменяемое поле то мы должны возвращать его клон а не самого,это
    поможет нам сохранять инкапсуляцию
*/

    public Date getDate() {
        return (Date) date.clone();
/**
 *  return date;  будет поводом для нарушения инкапсуляции к примеру:
 *   Student student = new Student(18, "John", new Date());
 *         Date d = student.getDate();
 *         d.setTime(0);
 *         System.out.println(student);
 *         //дата обнулится Student{age=18, name='John', date=Thu Jan 01 04:00:00 GMT+04:00 1970}
 *
 */
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}