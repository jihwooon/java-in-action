package core.sec01;

public class SquareSequence implements IntSequence, Closeable {
    private int i;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        i++;
        return i * i;
    }

    @Override //IntSequence 상속 받은 Closeable 인터페이스
    public boolean isOpen() {
        throw new UnsupportedOperationException("SquareSequence#isOpen not implemented yet !!");
    }

    @Override // Closeable 인터페이스
    public void close() {
        throw new UnsupportedOperationException("SquareSequence#close not implemented yet !!");
    }
}
