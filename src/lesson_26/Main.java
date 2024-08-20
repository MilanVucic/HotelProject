package lesson_26;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Belgrade"));
        System.out.println(dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy h:mma");
        System.out.println(dateTimeFormatter.format(dateTime));

        String dateString = "20-Aug-2024 7:05PM";
        LocalDateTime localDateTime = LocalDateTime.parse(dateString, dateTimeFormatter);
        System.out.println(localDateTime);
    }

    private static void instantExample() {
        Instant instant = Instant.now();
        System.out.println(instant.getEpochSecond());
        LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.of("Europe/Belgrade"));
        System.out.println(localDate);
        LocalDate localDate2 = LocalDate.ofInstant(instant, ZoneId.of("Asia/Aqtau"));
        System.out.println(localDate2);
    }

    private static void localDateTimeExample() {
        LocalDate localDate = LocalDate.now();
        LocalDate daysAgo = localDate.minusDays(5);
        System.out.println(daysAgo);

        LocalTime localTime = LocalTime.of(10, 55, 33);
        LocalTime inFuture = localTime.plusHours(15);
        System.out.println(localTime);
        System.out.println(inFuture);

        LocalDateTime localDateTime = LocalDateTime.of(daysAgo, inFuture);
        System.out.println(localDateTime);
        LocalDateTime monthsInFuture = localDateTime.plusDays(66);
        System.out.println(monthsInFuture);
    }

    private static void calendarExample() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(Calendar.MINUTE, 55);
        System.out.println(calendar.getTime());
    }

    private static void sdfExample() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy h:mma");
        System.out.println(dateFormat.format(date));
    }

    private static void dateBugExample() {
        Date date = new Date();
        System.out.println(date);
        int max = Integer.MAX_VALUE;
        int greaterThanMax = max + 1;
        System.out.println(greaterThanMax);
        System.out.println(max);
        long daysInFuture = 30L * 24 * 60 * 60 * 1000; // if it's 30 without L, we have a bug
        System.out.println(daysInFuture);
        Date inTheFuture = new Date(date.getTime() + daysInFuture);
        System.out.println(inTheFuture);
    }
}
