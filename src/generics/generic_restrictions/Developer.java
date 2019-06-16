package generics.generic_restrictions;

public class Developer extends Employee{
    private int bonus;

    public Developer() {
    }

    public Developer(int id, String name, double salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}