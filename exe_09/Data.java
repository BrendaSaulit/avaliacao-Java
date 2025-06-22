package exe_09;

import java.time.LocalDate;

public class Data {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.of(2025, 6, 9);
        LocalDate prazo = hoje.plusDays(10);
        System.out.println(prazo);
    }
}
