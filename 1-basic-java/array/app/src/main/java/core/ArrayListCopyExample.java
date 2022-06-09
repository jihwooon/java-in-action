package core;

import java.util.Arrays;

public class ArrayListCopyExample {

    public static void main(String[] args) {

        int[] primes = new int[]{1,2,3,4,5};
        int[] numbers = primes;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if(number == 5) {
                System.out.println(42);
            }
        }

        int[] copiedPrimes = Arrays.copyOf(primes, primes.length);

        System.out.println(copiedPrimes.length);
    }

}
