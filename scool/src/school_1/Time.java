package school_1;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {

   /*     System.out.println(LocalDateTime.now());
        System.out.println(OffsetDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

    */

        try {
            System.out.println(LocalDate.parse("2021-01-01",DateTimeFormatter.ISO_DATE));
            System.out.println(LocalTime.parse("08:08:08",DateTimeFormatter.ISO_TIME));
            System.out.println(LocalDate.parse("2024-123",DateTimeFormatter.ISO_OFFSET_DATE));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
