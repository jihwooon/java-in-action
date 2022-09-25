package example;

import java.util.stream.Stream;

public class Fibonacci {
    public int solution(int n) {

        if (n == 0) {
            return 0;
        }

        if (n <= 2) {
            return 1;
        }

        return solution(n - 1) + solution(n - 2);
    }

    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1}, t -> new int[] {t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .forEach(System.out::println);
    }

}
