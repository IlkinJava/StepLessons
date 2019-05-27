package abstract_classes;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car(); Объект абстрактного класса создать нельзя
        Bmw bmw =new Bmw();
        bmw.run();
        Audi audi = new Audi();
        audi.run();
        bmw.stop();
        audi.stop();
    }
}