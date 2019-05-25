public class Developer extends Employee {
    private int bonus;

    public Developer() {
    }


    public Developer(int id, String name, String position, double salary, int bonus) {
        super(id, name, position, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return bonus + super.getSalary();
    }

    @Override
    public String toString() {
        return super.toString()  +
                "bonus=" + bonus +
                '}';
    }
}
