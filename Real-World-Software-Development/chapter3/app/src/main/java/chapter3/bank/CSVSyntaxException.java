package chapter3.bank;

public class CSVSyntaxException extends Exception{
    public CSVSyntaxException() {
        super("문법 오류가 발생했습니다.");
    }
}
