package basic;

import java.util.Scanner;

public class MenuRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int number1 = scanner.nextInt();
        System.out.println("The number you entered is " + number1);

        System.out.print("Enter Number2: ");
        int number2 = scanner.nextInt();
        System.out.println("The number you entered is " + number2);

        performOperationUsing(number1, number2);

        puzzle2(number1);
    }

    private static void puzzle2(int number) {
        switch (number) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Default");
        }
    }

    private static void performOperationUsing(int number1, int number2) {

        switch (number1) {
            case 1 :
                System.out.println(1);
                break;
            case 2 :
                System.out.println(2);
                break;
            case 3 :
                System.out.println(3);
                break;
            default:
                System.out.println("Not Found Exception");
                break;
        }

        if(number2 == 2) {
            System.out.println("Result " + number2);
        } else {
            System.out.println("Not Found Exception");
        }
    }
}
