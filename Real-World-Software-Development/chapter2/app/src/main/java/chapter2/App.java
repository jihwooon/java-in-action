/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package chapter2;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

        BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze(bankStatementParser);
    }
}
