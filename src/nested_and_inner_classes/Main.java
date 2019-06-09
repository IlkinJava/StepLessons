package nested_and_inner_classes;

public class Main {
    public static void main(String[] args) {
        ElectroCar electroCar = new ElectroCar(1);
        ElectroCar.Battery battery = new ElectroCar.Battery();//Объект статического вложенного класса
        electroCar.start();
        battery.charge();

    }
}
