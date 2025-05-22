package estudos.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dataHora {
    public static void main(String[] args) {
        //classe do java para formatação de datas customizadas
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-05-22");
        LocalDateTime d05 = LocalDateTime.parse("2024-05-22T10:33:45");
        Instant d06 = Instant.parse("2024-05-22T10:33:45Z");
        Instant d07 = Instant.parse("2024-05-22T10:33:45-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2025", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/02/2025 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2024, 12, 5, 12, 30);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);

    }
}
