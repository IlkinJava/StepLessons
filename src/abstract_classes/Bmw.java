package abstract_classes;

public class Bmw extends Car {
    @Override
    public void run() {
        setSpeed(200);
        System.out.println(getSpeed());
    }
}