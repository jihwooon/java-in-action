package solution01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

/*
* .
1〜49 사이의 서로 다른 숫자를 여섯 개 골라 복권의 숫자 조합을 출력하는 프로그램을 작성하라.
* (서로 다른 숫자를 여섯 개 골라내려고 먼저 1-49로 채워진 배열 리스트를 만든다.
* 임의의 인덱스를 골라 해당하는 요소를 제거한다. 이 작업을 여섯 번 반복한다.
* 그런 다음 결과를 정렬해 출력한다.)
* */


@DisplayName("복권의 숫자 조합")
public class Example13Test {

    public int[] solution() {
        Random random = new Random();
        int[] numbers = new int[6];

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = random.nextInt(49);

            System.out.println("numbers[i] : " + numbers[i]);
        }

        Arrays.sort(numbers);

        return numbers;
    }

    @Test
    void result1() {
        assertThat(solution().length).isEqualTo(6);
    }

    public static void main(String[] args) {
        var size = 49;
        var r = new Random(System.currentTimeMillis());
        var possibles = new ArrayList<Integer>(size + 1);

        for(var i = 1; i <= size; i++) {
            possibles.add(i);
        }

        var picked = new ArrayList<Integer>(6);
        for(var i = 0; i < 6; i++) {
            var pickIndex= r.nextInt(size - 1);
            picked.add(possibles.remove(pickIndex));
        }

        Collections.sort(picked);
        for (var i : picked) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }


}
