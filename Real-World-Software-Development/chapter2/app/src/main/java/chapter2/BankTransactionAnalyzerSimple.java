package chapter2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "/Users/jihwooon/Documents/Java-Study/Real-World-Software-Development/chapter2/app/src/main/resources/bankacount.csv";

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get(RESOURCES);
        List<String> lines = Files.readAllLines(path);
        DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        double total = 0d;
        for (final String line : lines) {
            final String[] columns = line.split(",");
            final LocalDate local = LocalDate.parse(columns[0], DATE_PATTERN);
            if (local.getMonth() == Month.JANUARY) {
                double amount = Double.parseDouble(columns[1]);
                total += amount;
            }
        }

        System.out.println("The total for all transactions is " + total);
    }
}
