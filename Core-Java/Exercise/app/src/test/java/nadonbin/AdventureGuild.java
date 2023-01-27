package nadonbin;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 모험가 길드
 * ## 미지의 것
 * N명의 모험가에 대한 정보가 주어졌을 때, 여행을 떠날 수 있는 그룹 수의 최대값을 구하라.
 * ## 자료
 * - 그룹의 수
 * >> 공포도가 높은 사람이 무리 지어야 한다.
 * - 모험가의 수
 * >> N의 갯수
 * - 공포도
 * >> 모험가가 쉬벡 공포를 느껴 위험 상황에 대처가 낮다.
 * -
 * ## 조건
 * - 공포도가 x인 모험가는 x명이상으로 구성된 모험가 그룹에 참여해야 여행을 떠날 수 있다.
 * -
 * <p>
 * ## 계획
 * - 배열로 받습니다.
 * - 배열의 수를 정렬합니다.
 * -
 * <p>
 * <p>
 * ## 반성
 * -
 * -
 */

public class AdventureGuild {

    public int solution(int[] num) {
        int group = 0; //총 그룹의 수
        int adventurer = 0; //현재 그룹에 포함되어 있는 모험자의 수

        Arrays.sort(num);

        for(int s : num) { //공포도가 낮은 것부터 하나씩 확인
            adventurer += 1; // 현재 그룹에 해당 모험가를 포함시기키
            if(adventurer >= s) { // 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
                group +=1; // 총 그룹의 수 증가시키기
                System.out.println("group = " + group);
                adventurer = 0; // 현재 그룹에 포함된 모험가의 수 초기화
            }
        }

        return group;
    }

    @Test
    void result() {
        assertThat(solution(new int[]{2, 3, 1, 2, 2})).isEqualTo(2);
    }
}
