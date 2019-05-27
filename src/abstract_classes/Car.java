package abstract_classes;

abstract class Car {
    private int speed;

    public Car() {
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }

    abstract public void run();

    public void stop() {
        speed = 0;
        System.out.println(speed);
    }
}