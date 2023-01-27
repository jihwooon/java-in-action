package core;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class Lambda implements Comparator<String> {

    public static void main(String[] args) {
        // 문자열을 길이로 정렬하고, 한 문자열이 다른 문자열보다 짦은지 검사하는 코드 작성
        String[] friends = {"Peter", "Paul", "Mary"};
        Arrays.sort(friends,
                (String first, String second) -> first.length() - second.length());

        System.out.println("Lambda " + Arrays.toString(friends));

        Arrays.sort(friends, new Lambda());
        System.out.println("Interface " + Arrays.toString(friends));
    }

    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }

    @Test
    void result() {
        assertThat(solution(new String[]{"Peter", "Paul", "Mary"})).isEqualTo(new String[]{"Paul", "Mary", "Peter"});
        assertThat(solution1(new String[]{"Peter", "Paul", "Mary"})).isEqualTo(new String[]{"Paul", "Mary", "Peter"});
    }

    private String[] solution(String[] str) {
        Arrays.sort(str,
                (String first, String second) -> first.length() - second.length());

        return str;
    }

    private String[] solution1(String[] str) {
        Arrays.sort(str,
                (String first, String second) -> {
                    int difference = first.length() - second.length();
                    if (difference < 0) return -1;
                    else if (difference > 0) return 1;
                    else return 0;
                });
        return str;
    }
}
