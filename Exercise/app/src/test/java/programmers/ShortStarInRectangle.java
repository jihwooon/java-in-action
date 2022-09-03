package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ## 직사각형 별찍기
 * 미지의 것: 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
 * <p>
 * ## 자료
 * - 가로의 길이가 n
 * - 세로의 길이가 m
 * - 직사각형
 * ## 조건
 * - n과 m은 각각 1000 이하인 자연수입니다.
 * <p>
 * ## 계획
 * - 첫번째 입력 값과 두번재 입력값을 받는다.
 * - 두번째 인덱스를 먼저 반복한다.
 * - 첫번째 인덱스를 두번째 인덱스 루프문 안에서 반복한다.
 * - "*"를 출력한다.
 *
 * ## 반성
 * - 이중 루프문을 for (int i = 0; i < b; i++) 루프문 헤더를 --i 로 풀어 볼 수 있을 것 같다.
 * - 이중 루프문을 O(N)으로 바꿔보는 것도 고려 해 볼수 있을 것 같다.
 * - Scanner 말고 BufferReader를 사용해서 입력 속도를 향상 시킬 수 있다.
 */
public class ShortStarInRectangle {
    //BufferedReader로 적용하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
