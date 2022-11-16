package DateDemo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime birthDate = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
        System.out.println(birthDate);

        System.out.println(ChronoUnit.YEARS.between(birthDate, today));
        System.out.println(ChronoUnit.MONTHS.between(birthDate, today));
        System.out.println(ChronoUnit.WEEKS.between(birthDate, today));
        System.out.println(ChronoUnit.DAYS.between(birthDate, today));
        System.out.println(ChronoUnit.HOURS.between(birthDate, today));
        System.out.println(ChronoUnit.MINUTES.between(birthDate, today));
        System.out.println(ChronoUnit.SECONDS.between(birthDate, today));
        System.out.println(ChronoUnit.MILLIS.between(birthDate, today));
        System.out.println(ChronoUnit.MICROS.between(birthDate, today));
        System.out.println(ChronoUnit.NANOS.between(birthDate, today));
        System.out.println(ChronoUnit.HALF_DAYS.between(birthDate, today));
        System.out.println(ChronoUnit.DECADES.between(birthDate, today));
        System.out.println(ChronoUnit.CENTURIES.between(birthDate, today));
        System.out.println(ChronoUnit.MILLENNIA.between(birthDate, today));
        System.out.println(ChronoUnit.ERAS.between(birthDate, today));
    }
}
