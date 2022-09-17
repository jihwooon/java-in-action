package example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class Example12Test {

    public int solution(int n, int acc) {

        if (n > 1) {
            return solution(n - 1, acc + n);
        }

        return acc + 1;
    }

    public int solution_recursive(int n) {
        int acc = 0;

        for(int i = n; i > 1; i--) {
            acc += i;
        }
        acc += 1;

        return acc;
    }

    public List<Character> reveres(String str) {
        char[] chars = str.toCharArray();
        List<Character> list = new ArrayList<>();

        for(char each : chars) {
            list.add(each);
        }

        Collections.reverse(list);
        System.out.println("list = " + list);
        list.toString();


        return list;
    }

    public int[] solution1(int n) {
        int[] answer = new int[n];
        for(int i=0; i<n; i++) {
            answer[i] = i + 1;
            System.out.println("answer[i] = " + answer[i]);
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 0; i < a; i++) {

            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    @Test
    void result() {
        assertThat(solution1(3)).isEqualTo(new int[]{1,2,3});
//        assertThat(solution_recursive(10)).isEqualTo(55);
//        assertThat(reveres("array")).isEqualTo(new Character['y', 'a', 'r', 'r', 'a']);

    }
}
