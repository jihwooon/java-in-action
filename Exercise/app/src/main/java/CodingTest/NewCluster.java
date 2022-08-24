package CodingTest;

import java.util.ArrayList;
import java.util.Collections;

public class NewCluster {

    public int solution(String str1, String str2) {
        int answer = 0;
        double jaccard = 0;

        //대문자인 문자열을 소문자로 변경합니다.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //합집합과 교집합을 ArrayList로 담는다.
        ArrayList<String> set1 = new ArrayList<>();
        ArrayList<String> set2 = new ArrayList<>();

        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        //두 문자열은 두 글자씩 끊어서 다중집합의 원소로 나눕니다.
        for (int i = 0; i < str1.length() - 1; i++) {

            char first = str1.charAt(i);
            char second = str1.charAt(i + 1);

            if ((first >= 'a' && first <= 'z') && (second >= 'a' && second <= 'z')) {
                set1.add(first + "" + second);
            }
            System.out.println();
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            char first = str2.charAt(i);
            char second = str2.charAt(i + 1);

            if ((first >= 'a' && first <= 'z') && (second >= 'a' && second <= 'z')) {
                set2.add(first + "" + second);
            }
        }


        Collections.sort(set1);
        Collections.sort(set2);

        System.out.println("set1 : " + set1);
        System.out.println("set2 : " + set2);

        //자카드 유사도 공식 : 합집합 / 교집합 나눕니다.
        for (String c : set1) {
            if (set1.add(c)) {
                intersection.add(c);
            }
            union.add(c);
        }

        for (String s : set2) {
            union.add(s);
        }

        if (union.size() == 0) {
            jaccard = 1;
        } else {
            jaccard = (double) union.size() / (double) intersection.size();
        }

        answer = (int) (jaccard * 65536);

        return answer;
    }

}
