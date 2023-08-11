package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataGenerator {
   // private DataGeneartor() {
//
   // }

    public static String generateDate(int shift) {
        return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
