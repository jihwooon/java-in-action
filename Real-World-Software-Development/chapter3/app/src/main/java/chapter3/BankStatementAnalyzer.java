package chapter3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankStatementAnalyzer {
    private static final String RESOURCES = "/Users/jihwooon/Documents/Java-Study/Real-World-Software-Development/chapter2/app/src/main/resources/bankacount.csv";

    public void analyze(final BankStatementParser bankStatementParser) throws IOException {
        final Path path = Paths.get(RESOURCES);
        List<String> lines = Files.readAllLines(path);

        List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFromCSV(lines);
        BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

        collectSummary(bankStatementProcessor);
    }

    private static void collectSummary(BankStatementProcessor bankStatementProcessor) {
        System.out.println("The total for all transactions is " + bankStatementProcessor.calculateTotalAmount());
        System.out.println("Transactions in January " + bankStatementProcessor.selectMonth(Month.JANUARY));
        System.out.println("The total Tesco received is " + bankStatementProcessor.calculateTotalForCategory("Tesco"));
    }
}
