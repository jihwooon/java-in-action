package chapter3;

import java.time.Month;
import java.util.List;

public class BankStatementProcessor {
    private List<BankTransaction> bankTransactions;

    public BankStatementProcessor(List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    public double summarizeTransactions(final BankTransactionSummarizer bankTransactionSummarizer) {
        double result = 0;
        for (final BankTransaction bankTransaction : bankTransactions) {
            result = bankTransactionSummarizer.summarize(result, bankTransaction);
        }
        return result;
    }

    public double calculateTotalInMonth(final Month month) {
        return summarizeTransactions((acc, bankTransaction) ->
                bankTransaction.getDate().getMonth() == month ? acc + bankTransaction.getAmount() : acc
        );
    }

    public double calculateTotalAmount() {
        double total = 0L;
        for (final BankTransaction bankTransaction : bankTransactions) {
            total += bankTransaction.getAmount();
        }
        return total;
    }

    public double calculateTotalForCategory(final String category) {
        double total = 0;
        for (final BankTransaction bankTransaction : bankTransactions) {
            if (bankTransaction.getDescription().equals(category)) {
                total = bankTransaction.getAmount();
            }
        }
        return total;
    }

    public List<BankTransaction> selectMonth(final Month month) {
        bankTransactions
                .stream()
                .filter(bankTransaction -> bankTransaction.getDate().getMonth() == month)
                .toList();
        return bankTransactions;
    }

    public List<BankTransaction> findTransactions(final BankTransactionFilter bankTransactionFilter) {
        bankTransactions
                .stream()
                .filter(bankTransaction -> bankTransactionFilter.test(bankTransaction))
                .toList();
        return bankTransactions;
    }
}
