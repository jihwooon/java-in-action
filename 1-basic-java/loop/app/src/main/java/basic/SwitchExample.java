package basic;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        int count = 0;
        String output = "";

        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();

        switch (count) {
            case 0:
                output = "None";
                System.out.println("output : " + output);
                break;
            case 1:
                output = "One";
                System.out.println("output : " + output);
            case 2:
            case 3:
            case 4:
            case 5:
                output = Integer.toString(count);
                System.out.println("output : " + output);
                break;
        }
    }
}
