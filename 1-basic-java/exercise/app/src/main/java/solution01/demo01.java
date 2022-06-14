package solution01;

import java.util.Scanner;

public class demo01 {

    public static void main(String[] args) {

        char test = 'a';
        char test2 = 'J'+ 1;
        System.out.println("test : " + test);
        System.out.println("tes2t : " + test2);
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String binaryString = Integer.toString(number, 2); // 2진수
        String octalString = Integer.toString(number, 8); // 8진수
        String hexString = Integer.toString(number, 16); // 16진수

        System.out.println("2진수 : " + binaryString);
        System.out.println("8진수 : " + octalString);
        System.out.println("16진수 : " + hexString);

        double reciprocal = Double.parseDouble(hexString);
        System.out.println("정수의 역수 : " + reciprocal);

    }

}
