package estudos.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class dataHora02 {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-04-12");
        LocalDateTime d02 = LocalDateTime.parse("2023-06-11T12:30:45");
        Instant d03 = Instant.parse("2025-09-09T22:30:45Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //formatação do Instant, pois Instant possui fuso horário específico
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println(fmt1.format(d01));
        System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(d02.format(fmt2));
        System.out.println(d02.format(fmt1));
        System.out.println(d02.format(fmt4));
        //para a formatação de tipos Instant, é preciso chamar pelo objeto datetimeformatter
        System.out.println(fmt3.format(d03));
        //na exibição, o ZoneId.systemDefault vai converter para o fuso horário local, nesse caso, Brasília

        System.out.println(fmt5.format(d03));
    }
}
