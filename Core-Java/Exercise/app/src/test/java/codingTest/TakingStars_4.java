package codingTest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제 <br>
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오. <br>
 *
 * 입력 : 5 <br>
 * 출력 : <br>
 * ***** <br>
 *  **** <br>
 *   *** <br>
 *    ** <br>
 *     * <br>
 * */
public class TakingStars_4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            for(int j = N-i; j<N; j++) {
                System.out.print(" ");
            }

            for(int k = i; k < N; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
