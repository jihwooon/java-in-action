package core;

import java.util.Scanner;

public class LoopElseExample {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        count = scanner.nextInt();
        sum = scanner.nextInt();

        if(count > 0) {
            double average = sum / count;
            System.out.println("average : " + average);
        } else if (count == 0){
            System.out.println("defalt : " + 0);
        } else {
            System.out.println("Hun?");
        }
    }

}
