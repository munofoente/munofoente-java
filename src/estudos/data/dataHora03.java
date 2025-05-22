package estudos.data;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class dataHora03 {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-03-18");
        LocalDateTime d02 = LocalDateTime.parse("2023-09-11T18:35:50");
        Instant d03 = Instant.parse("2024-05-01T15:40:56Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("Past week local date = " + pastWeekLocalDate);
        System.out.println("Next week local date = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("Next week instant: " + nextWeekInstant);
        System.out.println("Past week instant: " + pastWeekInstant);

        //não é possível calcular a duração entre LocalDate(s)
        //é preciso utilizar métodos para converter para localdatetime
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d02);

        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
    }
}
