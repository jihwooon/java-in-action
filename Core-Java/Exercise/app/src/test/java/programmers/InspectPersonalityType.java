package programmers;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class InspectPersonalityType {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> mbit = new HashMap<>();
        mbit.put('R', 0);
        mbit.put('T', 0);
        mbit.put('C', 0);
        mbit.put('F', 0);
        mbit.put('J', 0);
        mbit.put('M', 0);
        mbit.put('A', 0);
        mbit.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            char type1 = survey[i].charAt(0);
            System.out.println("type1 = " + type1);
            char type2 = survey[i].charAt(1);

            if (choices[i] > 4) {
                mbit.put(type2, mbit.get(type2) + (choices[i] - 4));
            } else if (choices[i] < 4) {
                mbit.put(type1, mbit.get(type1) + (4 - choices[i]));
            }

        }

        String answer = makeAnswer(mbit);

        return answer;
    }

    public static String makeAnswer(HashMap<Character, Integer> mbit) {
        StringBuilder stringBuilder = new StringBuilder();

        if (mbit.get('R') >= mbit.get('T')) {
            stringBuilder.append('R');
        } else {
            stringBuilder.append('T');
        }

        if (mbit.get('C') >= mbit.get('F')) {
            stringBuilder.append('C');
        } else {
            stringBuilder.append('F');
        }

        if (mbit.get('J') >= mbit.get('M')) {
            stringBuilder.append('J');
        } else {
            stringBuilder.append('M');
        }

        if (mbit.get('A') >= mbit.get('N')) {
            stringBuilder.append('A');
        } else {
            stringBuilder.append('N');
        }

        return stringBuilder.toString();
    }

    @Test
    void result() {

        assertThat(solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5})).isEqualTo("TCMA");
        assertThat(solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3})).isEqualTo("RCJA");
    }

}
