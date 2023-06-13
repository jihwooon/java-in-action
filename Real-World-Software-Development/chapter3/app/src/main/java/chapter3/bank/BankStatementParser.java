package chapter3.bank;

import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFromCSV(String line) throws CSVSyntaxException;

    List<BankTransaction> parseLinesFromCSV(List<String> lines) throws CSVSyntaxException;
}
