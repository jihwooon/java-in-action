import java.time.LocalDate;
import java.util.ArrayList;

public class CreditCardForm {

    private static final ArrayList<Integer> expirationYear = new ArrayList<>();

    static {
        int year = LocalDate.now().getYear();
        for(int i = year; i<= year + 20; i++) {
            expirationYear.add(1);
        }
    }
}
