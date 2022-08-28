package example;

import java.util.Arrays;

public class StreamExample {

    public static void main(String[] args) {

        String[] words = {"abcbasdasdagag"};

        int count = 0;
        for (String w : words) {
            System.out.println(w.length());

            if (w.length() > 12) {
                count++;
                System.out.println(count);
            }
            System.out.println(w);
        }

        long count1 = Arrays.stream(words)
                .filter(w -> w.length() > 12)
                .count();

        System.out.println("count1 = " + count1);

    }
}
