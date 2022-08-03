package basic;

import java.util.Scanner;

public class LoopExample {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        count = scanner.nextInt();
        sum = scanner.nextInt();

        if(count > 0) {
            double average = sum / count;
            System.out.println("average : " + average);
        }
    }

}
