import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        // Clock class
        Clock cl = Clock.systemDefaultZone();
        System.out.println("Time Zone: " + cl.getZone());
        System.out.println("Current Instant: " + cl.instant());

        // Duration class
        Duration d1 = Duration.between(LocalTime.MIN, LocalTime.NOON);
        System.out.println("Is d1 negative? " + d1.isNegative());

        Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN);
        System.out.println("Is d2 negative? " + d2.isNegative());

        Duration d3 = Duration.between(LocalTime.MIN, LocalTime.MIDNIGHT);
        System.out.println("Is d3 zero? " + d3.isZero());

        Duration d4 = Duration.between(LocalTime.MAX, LocalTime.MIN);
        System.out.println("Is d4 zero? " + d4.isZero());

        // LocalDate class
        LocalDate date1 = LocalDate.parse("2021-05-27");
        LocalDate date2 = LocalDate.parse("2021-05-26");

        System.out.println("Are date1 and date2 equal? " + date1.equals(date2));

        LocalDate date3 = date1.withYear(2001);
        System.out.println("Modified date3: " + date3);

        // LocalTime class
        LocalTime time1 = LocalTime.now();
        System.out.println("Current Time: " + time1);

        LocalTime time2 = LocalTime.of(13, 18, 29);
        System.out.println("Time before adding hours: " + time2);

        LocalTime time3 = time2.plusHours(5);
        System.out.println("Time after adding 5 hours: " + time3);

        LocalTime time4 = LocalTime.of(15, 28, 19);
        System.out.println("Time before subtracting minutes: " + time4);

        LocalTime time5 = time4.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes: " + time5);

        // Additional Duration methods
        Duration duration1 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println("Duration 1: " + duration1);

        Duration duration2 = Duration.ofDays(5);
        System.out.println("Duration 2: " + duration2);

        Duration duration3 = Duration.ofMinutes(120);
        System.out.println("Duration 3: " + duration3);
    }
}
