package exe_01;

import java.time.LocalDate;

public class Agendamento {
    public static void main(String[] args) {
        LocalDate base = LocalDate.of(2025, 6, 1);
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2 - 3);
        System.out.println(novaData.getDayOfMonth());
    }
}
