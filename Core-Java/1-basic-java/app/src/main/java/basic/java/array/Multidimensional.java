package basic.java.array;

public class Multidimensional {

    int[][] square = {
            {16, 3, 2, 13},
            {5, 10, 11, 8},
            {9, 6, 7, 12},
            {4, 15, 14, 1}
    };

    public int[] swapIndex() {
        int[] temp = square[0];
        square[0] = square[1];
        square[1] = temp;

        return temp;
    }

    public int[][] makeTriangle() {
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

        return triangle;
    }
}
