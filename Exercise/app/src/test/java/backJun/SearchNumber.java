package backJun;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * ## 수 찾기
 * 미지의 것: N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
 * <p>
 * ## 자료
 * - A[1], A[2], …, A[N] : 0 ~ N-1 자리수의 배열
 * <p>
 * <p>
 * 조건
 * - N과 M의 수를 비교해서 존재하면 1, 존재 하지 않으면 0으로 반환한다.
 * <p>
 * ## 계획
 * - 수를 정렬을 한다.
 * - 이진 탐색을 해서 각 배열마다 비교 한다.
 * - 배열에 존재하면 1로 반환 없으면 0으로 반환한다.
 * ## 반성
 * - 입출력에 관한것을 모르다보니 문제에 손을 될 수가 없었다.
 * - StringBuffer, StringTokenizer, BufferedReader 을 잘 알고 써야겠습니다.
 */
public class SearchNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(N);

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        System.out.println(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {

            if (Arrays.binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
}
