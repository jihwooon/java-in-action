package example;

import java.util.Arrays;

public class TwoArrayDemo {

    public static void main(String[] args) {
        int[][] square =
                {
                        {16, 3, 2, 13},
                        {3, 10, 11, 8},
                        {9, 6, 7, 12},
                        {4, 15, 14, 1}
                };

        //행 바꾸기
        int[] temp = square[2];
        System.out.println("temp = " + Arrays.toString(temp));
        square[2] = square[0];
        square[0] = temp;
        System.out.println("square = " + Arrays.deepToString(square));


        int n = 5;
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        for (int r = 0; r < triangle.length; r++) {
            for (int c = 0; c < triangle[r].length; c++) {
                System.out.printf("%4d", triangle[r][c]);
            }
            System.out.println();
        }

        for (int[] row : triangle) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }

        //구구단
        for (int i = 1; i <= 9; i++) {// 세로
            for (int j = 1; j <= 9; j++) { // 가로
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        //별찍기
        for (int i = 1; i <= 5; i++) { // 행이 한번 돌 때
            //순서에 따라 빈값 채우기
            for (int k = 1; k <= 5 - i; k++) { // 1행에 4열까지 빈값 채우기
                System.out.print(" ");
            }

            //빈값이 다 채워지고 나머지에 별 채우기
            for (int j = 1; j <= i; j++) { //
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
