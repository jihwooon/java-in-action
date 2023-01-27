package Ch1;

import java.util.Random;

public class Ch1_10 {

    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt();
        System.out.println("" + value + " " + Long.toString(value, 36));
    }
}
