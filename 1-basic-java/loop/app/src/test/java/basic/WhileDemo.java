package basic;

import java.util.Random;

public class WhileDemo {

    public static void main(String[] args) {

        Random generator = new Random();
        int sum = 0;
        int count = 20;
        int target = 90;

        while (sum < target) {
            int next = generator.nextInt(10);
            sum += next;
            count++;
            System.out.println(count);
        }

        System.out.println("After " + count
                + " iterations, the sum is " + sum);
    }
}
