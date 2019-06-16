package generics.examples;

public class Manager extends Employee {

    private int bonus;

    public Manager() {
    }

    public Manager(String name, int bonus) {
        super(name);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}