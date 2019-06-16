package generics.generic_restrictions;

public class JavaDeveloper extends Developer {
    private double experience;

    public JavaDeveloper() {
    }

    public JavaDeveloper(int id, String name, double salary, int bonus, double experience) {
        super(id, name, salary, bonus);
        this.experience = experience;
    }
}
