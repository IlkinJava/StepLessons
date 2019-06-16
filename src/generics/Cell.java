package generics;

public class Cell<T> {
    private T thing;

    public T getThing() {
        return thing;
    }

    public void setThing(T thing) {
        this.thing = thing;
    }

    public <Y> Y genericMethod(Y y) {
        return y;
    }

    public static void main(String[] args) {
        Cell<String> cell = new Cell<>();
        cell.setThing("Gold");
        System.out.println(cell.getThing());
        System.out.println(cell.genericMethod(5));

    }
}
