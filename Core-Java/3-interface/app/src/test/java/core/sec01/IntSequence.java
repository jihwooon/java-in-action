package core.sec01;

public interface IntSequence extends Channel {

    static IntSequence digitsOf(int n) {
        return new DigitSequence(n);
    }
    boolean hasNext();
    int next();
}
