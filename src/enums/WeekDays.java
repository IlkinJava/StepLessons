package enums;

public enum WeekDays {
    MONDAY("Mon", 1), TUESDAY("Tue", 2), WEDNESDAY("Wed", 3), THURSDAY("Thu", 4), FRIDAY("Fri", 5), SATURDAY("Sat", 6), SUNDAY("Sun", 7);

    private String name;
    private int day;

    WeekDays(String name, int day) {
        this.name = name;
        this.day = day;
    }

    WeekDays() {

    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "WeekDays{" +
                "name='" + name + '\'' +
                ", day=" + day +
                '}';
    }
}