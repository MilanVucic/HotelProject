package lesson_19;

public enum DayOfWeek {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat"),
    SUNDAY("Sun");

    private String shortName;

    DayOfWeek(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public DayOfWeek nextDay() {
        return values()[(ordinal() + 1) % values().length];
    }

    public DayOfWeek previousDay() {
        return values()[(ordinal() - 1) % values().length];
    }

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    @Override
    public String toString() {
        return shortName;
    }
}
