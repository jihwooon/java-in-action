package core;

import java.util.Arrays;

public class ArrayListCopyExample {

    public static void main(String[] args) {

        int[] primes = new int[]{3, 1, 2, 4, 5};
        System.out.println(Arrays.toString(primes));
        int[] numbers = primes;

        Arrays.sort(primes);

        System.out.println(Arrays.toString(primes));

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number == 5) {
                System.out.println(42);
            }
        }

        int[] copiedPrimes = Arrays.copyOf(primes, primes.length);

        System.out.println(copiedPrimes.length);
    }

}
