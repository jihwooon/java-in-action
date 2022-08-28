package core.sec01;

public class SquareSequenceDemo {

    public static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }


    public static void main(String[] args) {
        SquareSequence squares = new SquareSequence();
        double avg = average(squares, 100);
        System.out.println("avg = " + avg);


//        IntSequence digit = new DigitSequence(1729);
//        while (digit.hasNext()) System.out.println(digit.hasNext() + " ");
//        System.out.println();

        IntSequence digit = new DigitSequence(1792);
        avg = average(digit, 100);
        System.out.println("avg = " + avg);
    }
}
