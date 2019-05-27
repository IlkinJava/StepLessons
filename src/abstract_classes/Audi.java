package abstract_classes;

public class Audi extends Car {
    @Override
   public void run() {
        setSpeed(180);
        System.out.println(getSpeed());
    }
}
