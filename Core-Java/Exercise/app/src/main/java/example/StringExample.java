package example;

import java.util.ArrayList;
import java.util.List;

public class StringExample {
    // StringBuilder
    private String getStringBuilder(int... arr) {
        if (arr == null) {
            return "null";
        }

        if (arr.length - 1 == -1) {
            return "[]";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; ; i++) {
            stringBuilder.append(arr[i]);

            if (arr[i] == arr.length - 1) {
                return stringBuilder.append("]").toString();
            }
            stringBuilder.append(", ");
        }
    }

    //StringBuffer
    public String getStringBuffer(int... arr) {
        if (arr == null) {
            return "null";
        }

        if (arr.length - 1 == -1) {
            return "[]";
        }


        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");

        for (int i = 0; ; i++) {
            stringBuffer.append(arr[i]);
            if (arr[i] == arr.length - 1) {
                return stringBuffer.append("]").toString();
            }
            stringBuffer.append(", ");
        }
    }

    //chartAt
    // 문자열을 정수값으로 변경한다.
    public int getChartAt(String str) {
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            answer = answer * 26 + c - 'A' + 1;
        }
        return answer;
    }

    //동등성 비교
    public boolean isCheck(String str) {
        boolean result = false;

        if(str.equals("aBC")) {
            result = true;
        }

        return result;
    }

    public int isCompareTo(String str) {
        int result = 0;

        result = "abc".compareTo(str);

        return result;
    }

    public List<List<String>> getListString(List<String> list) {
        ArrayList<List<String>> arr = new ArrayList<>();
        arr.add(list);

        return arr;
    }

    public static void main(String[] args) {
        int[] ints = {};

        StringExample stringExample = new StringExample();

        stringExample.getStringBuffer(ints);

        System.out.println("StringBuffer : " + stringExample.getStringBuffer(ints));

        stringExample.getStringBuilder(ints);

        System.out.println("StringBuilder : " + stringExample.getStringBuilder(ints));

        stringExample.getChartAt("abcd");

        System.out.println("stringExample = " + stringExample.getChartAt("abcd"));

        stringExample.isCheck("abc");
        System.out.println("stringExample.isCheck(\"abc\") = " + stringExample.isCheck("abc"));

        System.out.println("stringExample.isCheck(\"abc\") = " + stringExample.isCheck("aBC"));

        stringExample.isCompareTo("abc");

        System.out.println("stringExample.isCompareTo(\"abc\") = " + stringExample.isCompareTo("abc"));

        System.out.println("stringExample.isCompareTo(\"abc\") = " + stringExample.isCompareTo("aBC"));



    }

}
