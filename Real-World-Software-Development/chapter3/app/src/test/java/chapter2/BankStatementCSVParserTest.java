package chapter2;

import chapter3.bank.BankStatementCSVParser;
import chapter3.bank.BankStatementParser;
import chapter3.bank.BankTransaction;
import chapter3.bank.CSVSyntaxException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

class BankStatementCSVParserTest {
    private final BankStatementParser statementParser = new BankStatementCSVParser();

    @Test
    public void shouldParseOnCorrectLine() throws CSVSyntaxException {
        String line = "30-01-2017,-100,Deliveroo";

        BankTransaction result = statementParser.parseFromCSV(line);

        BankTransaction bankTransaction = new BankTransaction(LocalDate.of(2017, Month.JANUARY, 30), -100, "Deliveroo");

        assertThat(bankTransaction.getDate()).isEqualTo(result.getDate());
        assertThat(bankTransaction.getAmount()).isEqualTo(result.getAmount());
        assertThat(bankTransaction.getDescription()).isEqualTo(result.getDescription());

    }
}
