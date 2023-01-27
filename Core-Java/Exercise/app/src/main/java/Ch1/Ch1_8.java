package Ch1;

import java.util.Scanner;

/*
 * 문자열을 읽어서 비어 있지 않는 부분 문자열을 모두 출력하는 프로그램을 작성하라.
 */
public class Ch1_8 {

    public String solution(String str) {
        String substring = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                for (int j = str.length(); j > i; j--) {
                    if (!Character.isWhitespace(str.charAt(j - 1))) {
                        substring = str.substring(i, j);
                        System.out.println("result = " + substring);

                    }
                }
            }
        }

        return substring;
    }
}
