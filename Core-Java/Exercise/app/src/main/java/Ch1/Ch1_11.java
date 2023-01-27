package Ch1;


import java.util.Scanner;

/*
 * 텍스트 한 줄을 읽고 아스키 외의 모든 문자를 유니코드 값고 함께 출력하는 프로그램을 작성하라.
 * */
public class Ch1_11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        line.chars().forEach(value -> {
            if (value >= 128) {
                System.out.printf("%s \\u%04x\n", Character.toString((char) value), value);
            }
        });
    }
}

