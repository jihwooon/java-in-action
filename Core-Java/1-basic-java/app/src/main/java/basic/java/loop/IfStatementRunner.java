package basic.java.loop;

public class IfStatementRunner {

    public static void main(String[] args) throws InterruptedException {
        puzzle1(24);
        puzzle2(21);

    }

    private static void puzzle1(int i) {
        if (i == 25) {
            System.out.println("i = " + i);
        } else if (i == 24) {
            System.out.println("i = " + i);
        } else {
            System.out.println("i != 24 and i != 25");
        }
    }

    private static void puzzle2(int i) {
        if (i < 20) {
            System.out.println("m < 20 : " + i);
        } else if (i > 20) {
            System.out.println("m > 20 : " + i);
        } else {
            System.out.println("Who am I?");
        }
    }
}
