package lesson_19;

public class Main {
    public static void main(String[] args) {
        int choice = 55;
        switch (choice) {
            case 0:
                System.out.println("0 was chosen. Add item...");
                System.out.println("....");
                break;
            case 1:
                System.out.println("1 was chosen. Edit item...");
                break;
            case 2:
                System.out.println("2 was chosen. Delete item...");
                break;
            case 3:
                System.out.println("3 was chosen. Save item...");
                break;
            default:
                System.out.println("Choose again, invalid input...");
        }
        DayOfWeek day = DayOfWeek.TUESDAY;
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                System.out.println("Go to work.");
            case FRIDAY:
        }

        MessageStatus messageStatus = MessageStatus.SENT;

        switch (messageStatus) {
            case NOT_SENT:
                System.out.println("Message not sent. Try again.");
                break;
            case SENT:
                System.out.println("Message is successfully sent.");
                break;
            case DELIVERED:
                System.out.println("Message delivered.");
                break;
            case READ:
                System.out.println("Message read.");
                break;
        }
    }

    private static void enumExample() {
        DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
        System.out.println(dayOfWeek);
        DayOfWeek nextDay = dayOfWeek.nextDay();
        System.out.println(nextDay.nextDay());
        DayOfWeek anotherDay = DayOfWeek.valueOf("MONDAY");
        System.out.println(anotherDay);
    }

    private static void singletonExample() {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s);
        System.out.println(s2);
    }
}
