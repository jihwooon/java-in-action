package Ch2;


import java.io.Console;
import java.util.Random;
import java.util.Scanner;

/**
Scanner 클래스의 nextInt 메서드를 생각해보자. 이 메서드는 접근자인가, 변경자인가? 그 이유는?
Random 클래스의 nextInt 메서드는 어떤가?
*/

public class Ch2_2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 접근자 메서드
        //메서드를 호출 시 값의 변경 없이 그대로 불러온다.
        int name = scanner.nextInt();

        System.out.println("nextInt :" + name);


        // 변경자 메서드
        // 메서드 호출 시 값의 객체의 대한 값이 변경 된다.
        Random random = new Random();

        int randomInt = random.nextInt();

        System.out.println("randomInt : " + randomInt);

    }

}
