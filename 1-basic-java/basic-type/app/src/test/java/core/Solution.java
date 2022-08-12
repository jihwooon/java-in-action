package core;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        int numbers[][] = new int[rows][columns];
        System.out.println("numbers : " + numbers);

        int number = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[rows][columns] = number++;
                System.out.println("numbers[rows][columns] = number++ : " + numbers[rows][columns]);
            }
        }

        int[] ret = new int[queries.length];
        for(int i=0 ; i<queries.length ; i++) {
            int[] query = queries[i];
            int r1=query[0]-1, c1=query[1]-1, r2=query[2]-1, c2=query[3]-1;
            int tmp = numbers[r1][c1];
            int min = tmp;

            for(int r=r1+1 ; r<=r2 ; r++) {
                min = Math.min(min, numbers[r][c1]);
                numbers[r-1][c1] = numbers[r][c1];
            }
            for(int c=c1+1 ; c<=c2 ; c++) {
                min = Math.min(min, numbers[r2][c]);
                numbers[r2][c-1] = numbers[r2][c];
            }
            for(int r=r2-1 ; r>=r1 ; r--) {
                min = Math.min(min, numbers[r][c2]);
                numbers[r+1][c2] = numbers[r][c2];
            }
            for(int c=c2-1 ; c>c1 ; c--) {
                min = Math.min(min, numbers[r1][c]);
                numbers[r1][c+1] = numbers[r1][c];
            }
            numbers[r1][c1+1] = tmp;
            ret[i] = min;
        }

        return answer;
    }


    @Test
    void result() {

        assertThat(solution(6, 6, new int[][]{})).isEqualTo(new int[]{8,10,25});
    }
}
