import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Formatting date using DateTimeFormatter
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Current DateTime: " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = dt.format(df);
        System.out.println("Formatted Date: " + formattedDate);

        // Using predefined format ISO_LOCAL_DATE
        DateTimeFormatter isoDateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        String isoFormattedDate = dt.format(isoDateFormatter);
        System.out.println("ISO Formatted Date: " + isoFormattedDate);

        // Using predefined format ISO_WEEK_DATE
        DateTimeFormatter isoWeekDateFormatter = DateTimeFormatter.ISO_WEEK_DATE;
        String isoWeekFormattedDate = dt.format(isoWeekDateFormatter);
        System.out.println("ISO Week Formatted Date: " + isoWeekFormattedDate);

        // Using predefined format ISO_ORDINAL_DATE
        DateTimeFormatter isoOrdinalDateFormatter = DateTimeFormatter.ISO_ORDINAL_DATE;
        String isoOrdinalFormattedDate = dt.format(isoOrdinalDateFormatter);
        System.out.println("ISO Ordinal Formatted Date: " + isoOrdinalFormattedDate);
    }
}
This program demonstrates the usage of DateTimeFormatter to format dates in different ways. It also shows how to use some of the predefined formats provided by the DateTimeFormatter class.

Output:

yaml
Copy code
Current DateTime: 2021-10-19T18:43:21.336319300
Formatted Date: 19.10.2021
ISO Formatted Date: 2021-10-19
ISO Week Formatted Date: 2021-W42-2
ISO Ordinal Formatted Date: 2021-292