package Ch1;

import java.util.Arrays;
import java.util.Random;

/*
 *
 * 1〜49 사이의 서로 다른 숫자를 여섯 개 골라 복권의 숫자 조합을 출력하는 프로그램을 작성하라.
 * 서로 다른 숫자를 여섯 개 골라내려고 먼저 1-49로 채워진 배열 리스트를 만든다.
 * 임의의 인덱스를 골라 해당하는 요소를 제거한다. 이 작업을 여섯 번 반복한다.
 * 그런 다음 결과를 정렬해 출력한다.
 * */
public class Ch1_13 {

    public int[] solution() {
        Random random = new Random();
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(49);
        }

        Arrays.sort(numbers);
        System.out.println("numbers : " + Arrays.toString(numbers));
        return numbers;
    }

}
