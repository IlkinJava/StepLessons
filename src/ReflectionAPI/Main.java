package ReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Test test = new Test();
        Class clss = test.getClass();


        Constructor[] constructors = clss.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }
        Method[] methods = clss.getDeclaredMethods();
        for (Method m : methods) {

            System.out.println(m);
            m.setAccessible(true);
            System.out.println(m.invoke(test,"reflection Test"));
        }
        Field[] fields = clss.getDeclaredFields();
        for (Field f : fields) {

            f.setAccessible(true);
            System.out.println(f.getInt(test));
            f.setInt(test, 5);
            System.out.println(f.getInt(test));
            try {
                System.out.println(f.getInt(test));
                f.setInt(test, 5);
                System.out.println(f.getInt(test));
            } catch (IllegalAccessException e) {
                System.out.println("t");
            }
            catch (IllegalArgumentException e) {
                System.out.println("Not int");
            }


        }
    }
}
