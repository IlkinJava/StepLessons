public class BackendDeveloper extends Developer {
    private String programmingLanguage;

    public BackendDeveloper() {
    }

    public BackendDeveloper(int id, String name, String position, double salary, int bonus, String programmingLanguage) {
        super(id, name, position, salary, bonus);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
