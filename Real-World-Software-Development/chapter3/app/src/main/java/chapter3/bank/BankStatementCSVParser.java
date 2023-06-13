package chapter3.bank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCSVParser implements BankStatementParser {
    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private int EXPECTED_ATTRIBUTES_LENGTH = 3;

    @Override
    public BankTransaction parseFromCSV(final String line) throws CSVSyntaxException {
        final String[] columns = line.split(",");
        if (columns.length < EXPECTED_ATTRIBUTES_LENGTH) {
            throw new CSVSyntaxException();
        }
        final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
        double amount = Double.parseDouble(columns[1]);
        String description = columns[2];

        return new BankTransaction(date, amount, description);
    }

    @Override
    public List<BankTransaction> parseLinesFromCSV(final List<String> lines) throws CSVSyntaxException {
        ArrayList<BankTransaction> bankTransactions = new ArrayList<>();
        for (final String line : lines) {
            bankTransactions.add(parseFromCSV(line));
        }

        return bankTransactions;
    }

}
