package chapter3;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementProcessor {
    private List<BankTransaction> bankTransactions;

    public BankStatementProcessor(List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
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
        final List<BankTransaction> bankTransactionsInMonth = new ArrayList<>();
        for (final BankTransaction bankTransaction : bankTransactions) {
            if (bankTransaction.getDate().getMonth() == month) {
                bankTransactionsInMonth.add(bankTransaction);
            }
        }
        return bankTransactionsInMonth;
    }

    // 특정 금액 이상의 은행 거래 내역 찾기
    public List<BankTransaction> findTransactionsGreaterThanEqual(final int amount) {
        ArrayList<BankTransaction> result = new ArrayList<>();
        for (BankTransaction bankTransaction : bankTransactions) {
            if (bankTransaction.getAmount() > amount) {
                result.add(bankTransaction);
            }
        }
        return result;
    }

    // 특정 월의 입출금 내역 찾기
    public List<BankTransaction> findTransactionsInMonth(final Month month) {
        ArrayList<BankTransaction> result = new ArrayList<>();
        for (BankTransaction bankTransaction : bankTransactions) {
            if (bankTransaction.getDate().getMonth() == month) {
                result.add(bankTransaction);
            }
        }
        return result;
    }
}
